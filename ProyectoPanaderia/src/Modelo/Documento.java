/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Armando Perugachi
 */
public class Documento extends Conexion {

    String fecha = LocalDate.now() + "";
    PreparedStatement ps;
    ResultSet rs;
    String ruta = System.getProperty("user.home");
    private int i = 0;

    public boolean pdfVentasEmpleado() {
        Document documento = new Document();
        Connection conexion = this.getConnection();

        try {
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/" + "Ventas del día (" + i + ").pdf"));

            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.add("Panadería el RETORNO\n\nVentas del día\n\n");
            parrafo.setFont(FontFactory.getFont("Tahoma", 13, Font.NORMAL, BaseColor.DARK_GRAY));

            documento.open();
            documento.add(parrafo);

            PdfPTable tablaVentasDia = new PdfPTable(8);
            tablaVentasDia.addCell("Id");
            tablaVentasDia.addCell("Producto");
            tablaVentasDia.addCell("Cantidad");
            tablaVentasDia.addCell("Precio");
            tablaVentasDia.addCell("Fecha de venta");
            tablaVentasDia.addCell("Nombre");
            tablaVentasDia.addCell("Apellido");
            tablaVentasDia.addCell("Cédula");

            ps = conexion.prepareStatement("select v.idVentas,v.nombre,v.cantidad,v.precio,"
                    + "v.fecha_de_venta,c.nombre,c.apellido,c.cedula "
                    + "from ventas as v inner join clientes as c on c.idClientes = v.idClientes "
                    + "where v.idVentas>=1;");
            rs = ps.executeQuery();//Obtener resultados

            while (rs.next()) {
                tablaVentasDia.addCell(String.valueOf(rs.getInt(1)));
                tablaVentasDia.addCell(rs.getString(2));
                tablaVentasDia.addCell(String.valueOf(rs.getInt(3)));
                tablaVentasDia.addCell(String.valueOf(rs.getDouble(4)));
                tablaVentasDia.addCell(String.valueOf(rs.getDate(5)));
                tablaVentasDia.addCell(rs.getString(6));
                tablaVentasDia.addCell(rs.getString(7));
                tablaVentasDia.addCell(String.valueOf(rs.getInt(8)));
            }

            documento.add(tablaVentasDia);
            /*
            Paragraph parrafo2 = new Paragraph();
            parrafo2.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo2.add("\n\n");*/
            documento.close();
            return true;
        } catch (DocumentException | FileNotFoundException | SQLException e) {
            System.err.print("Error, " + e);
            return false;
        } finally {
            try {
                conexion.close();
            } catch (SQLException e) {
                System.err.print("Error, " + e);
            }
            i++;
        }
    }

    public boolean pdfVentasEmpleado(ArrayList<Object[]> tabla) {
        Document documento = new Document();

        try {
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/" + "Ventas del día (" + i + ").pdf"));

            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.add("Panadería el RETORNO\n\nVentas del día   " + fecha + "\n\n");
            parrafo.setFont(FontFactory.getFont("Tahoma", 13, Font.NORMAL, BaseColor.DARK_GRAY));

            documento.open();
            documento.add(parrafo);

            PdfPTable tablaVentasDia = new PdfPTable(8);
            tablaVentasDia.addCell("Id");
            tablaVentasDia.addCell("Producto");
            tablaVentasDia.addCell("Cantidad");
            tablaVentasDia.addCell("Precio");
            tablaVentasDia.addCell("Fecha de venta");
            tablaVentasDia.addCell("Nombre");
            tablaVentasDia.addCell("Apellido");
            tablaVentasDia.addCell("Cédula");

            for (int i = 0; i < tabla.size(); i++) {
                for (int j = 0; j < 8; j++) {
                    tablaVentasDia.addCell((String.valueOf(tabla.get(i)[j])));
                }
            }
            documento.add(tablaVentasDia);
            /*
            Paragraph parrafo2 = new Paragraph();
            parrafo2.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo2.add("\n\n");*/
            documento.close();
            i++;
            return true;
        } catch (DocumentException | FileNotFoundException e) {
            System.err.print("Error, " + e);
            return false;
        }
    }

    public boolean pdfVentasEmpleado(DefaultTableModel modeloVentas) {
        Document documento = new Document();

        try {
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/" + "Ventas del día (" + i + ").pdf"));

            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.add("Panadería el RETORNO\n\nVentas del día\n\n");
            parrafo.setFont(FontFactory.getFont("Tahoma", 13, Font.NORMAL, BaseColor.DARK_GRAY));

            documento.open();
            documento.add(parrafo);

            PdfPTable tablaVentasDia = new PdfPTable(8);
            tablaVentasDia.addCell("Id");
            tablaVentasDia.addCell("Producto");
            tablaVentasDia.addCell("Cantidad");
            tablaVentasDia.addCell("Precio");
            tablaVentasDia.addCell("Fecha de venta");
            tablaVentasDia.addCell("Nombre");
            tablaVentasDia.addCell("Apellido");
            tablaVentasDia.addCell("Cédula");

            for (int i = 0; i < modeloVentas.getRowCount(); i++) {
                for (int j = 0; j < modeloVentas.getColumnCount(); j++) {
                    tablaVentasDia.addCell(String.valueOf(modeloVentas.getValueAt(i, j)));
                }

            }
            documento.add(tablaVentasDia);
            /*
            Paragraph parrafo2 = new Paragraph();
            parrafo2.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo2.add("\n\n");*/
            documento.close();
            i++;
            return true;
        } catch (DocumentException | FileNotFoundException e) {
            System.err.print("Error, " + e);
            return false;
        }
    }

}

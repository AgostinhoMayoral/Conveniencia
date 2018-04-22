/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.classes;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.imageio.stream.ImageOutputStream;
import javax.swing.Icon;

/**
 *
 * @author tinho
 */
public class ConversorImagemBytes {

    byte[] imagemUsuario = null;

    public byte[] imagemByte(Icon imagem) {
        Icon icon = imagem;
        BufferedImage img = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = img.createGraphics();
        icon.paintIcon(null, g2d, 0, 0);
        g2d.dispose();

        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            try (ImageOutputStream ios = ImageIO.createImageOutputStream(baos)) {
                ImageIO.write(img, "png", ios);
                // Set a flag to indicate that the write was successful
            }

            byte[] bytes = baos.toByteArray();
            imagemUsuario = bytes;
        } catch (IOException ex) {
        }
        return imagemUsuario;
    }

}

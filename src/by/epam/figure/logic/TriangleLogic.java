/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.figure.logic;

import by.epam.figure.action.TriangleAction;
import by.epam.figure.entity.Point;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import by.epam.figure.exception.TriangleException;

/**
 * @author Acer
 */
public class TriangleLogic {
    private static Logger logger = LogManager.getLogger(TriangleLogic.class);

    public static boolean checkIsTriangle(Point a, Point b, Point c) throws TriangleException {

        double ab = TriangleAction.calculateLength(a, b);
        double bc = TriangleAction.calculateLength(b, c);
        double ac = TriangleAction.calculateLength(a, c);

        if ((ab < (bc + ac)) && (bc < (ab + ac)) && (ac < (ab + bc))) {
            return true;
        } else {
            logger.log(Level.ERROR, "Invalid Triangle");
            throw new TriangleException("Invalid Triangle");

        }

    }


    public static boolean checkRightTriangle(Point a, Point b, Point c) {

        double ab = TriangleAction.calculateLength(a, b);
        double bc = TriangleAction.calculateLength(b, c);
        double ac = TriangleAction.calculateLength(a, c);

        return (Math.pow(ac, 2) == Math.pow(ab, 2) + Math.pow(bc, 2)) ||
                (Math.pow(bc, 2) == Math.pow(ab, 2) + Math.pow(ac, 2)) ||
                (Math.pow(ab, 2) == Math.pow(ac, 2) + Math.pow(bc, 2));
    }

}

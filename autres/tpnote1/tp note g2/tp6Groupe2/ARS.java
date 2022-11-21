public ?????    interface ARS {
    boolean contains(Point2D.Double p);

    /* fabriques static */

    static ARS getUnion(ARS p, ARS q){

    }

    static ARS getIntersect(ARS p, ARS q){

    }

    static ARS getComplement(ARS p ){

    }

    static ARS getRectangle(Point2D.Double a, Point2D.Double c){

    }

    //    static ARS simplifyComplement(ARS f) { }

}

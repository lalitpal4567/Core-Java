package javaBasics.variables.primitiveTypeVariables.variableDeclaration;


// Variable name should start from either (a - z or A - Z) or underscore ( _ ) or dollar sign ( $ )
// Valid characters: ( a - z, A - Z, 0 - 9 and $ and _ )

public class IdentifierDeclaration {
    public static void main(String[] args) {
        int weight;
        int Weight;
//        int 2night      // compilation error
        int _2night;
        int night222;
//        int _;          // compilation error
        int __;
        int _weight;
        int __weight;
        int __weight___;
        int _2_weight_;
        int just4you;
        int just_4_you;
//        int 2343;       // compilation error
        int b4U$$$$;
//        int b4###;      // compilation error
        int $marks;
        int $$$marks;
        int $;
        int $$$$;
//        int $$@$$;      // compilation error
        int _$00height;
//        int @height;    // compilation error
        int $_55_ageInYEARS_$_45;
    }
}

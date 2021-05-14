import java.util.Optional;
class Optional8 {
    //creation
    static String testOptional(){
        //empty optional;
        Optional<String> emptyOptional = Optional.empty();
        //with value;
        Optional<String> presentOptional = Optional.of("real value");
        //nullable optional;
        Optional<String> nullableOptional = Optional.ofNullable(null);
        return "nullableOptional.orElse(...):"+nullableOptional.orElse("nullable orElse value")+"\n"
                    +"presentOptional.isPresent():"+presentOptional.isPresent()+"\n"
                    +"presentOptional.orElse('...'):"+presentOptional.orElse("presentOptional else value ")+"\n"
                    +"emptyOptional.orElse('...'):"+emptyOptional.orElse("emptyOptional else value");
    }
}

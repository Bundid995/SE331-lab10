package camt.se331.shoppingcart.entity.transfer;

import java.util.Map;

/**
 * Created by KIMHUN on 19/4/2559.
 */
public class TokenTransfer {
        private final String token;


                public TokenTransfer(String token)
        {
                this.token = token;
            }


                public String getToken()
        {
                return this.token;
            }
    }



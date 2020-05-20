package com.sample.customer_statement_validator.model;

    public class SuccessfulResponseData {
        private String result;

        private String[] errorRecords;

//        public SuccessfulResponseData(String result, String[] errorRecords) {
//            this.result = result;
//            this.errorRecords = errorRecords;
//        }
        public String getResult ()
        {
            return result;
        }

        public void setResult (String result)
        {
            this.result = result;
        }

        public String[] getErrorRecords ()
        {
            return errorRecords;
        }

        public void setErrorRecords (String[] errorRecords)
        {
            this.errorRecords = errorRecords;
        }

        @Override
        public String toString()
        {
            return "SuccessfulResponseData [result = "+result+", errorRecords = "+errorRecords+"]";
        }
}

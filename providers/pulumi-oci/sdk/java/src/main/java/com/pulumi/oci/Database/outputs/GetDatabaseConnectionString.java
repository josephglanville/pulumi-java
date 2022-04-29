// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetDatabaseConnectionString {
    /**
     * @return All connection strings to use to connect to the Database.
     * 
     */
    private final Map<String,Object> allConnectionStrings;
    /**
     * @return Host name based CDB Connection String.
     * 
     */
    private final String cdbDefault;
    /**
     * @return IP based CDB Connection String.
     * 
     */
    private final String cdbIpDefault;

    @CustomType.Constructor
    private GetDatabaseConnectionString(
        @CustomType.Parameter("allConnectionStrings") Map<String,Object> allConnectionStrings,
        @CustomType.Parameter("cdbDefault") String cdbDefault,
        @CustomType.Parameter("cdbIpDefault") String cdbIpDefault) {
        this.allConnectionStrings = allConnectionStrings;
        this.cdbDefault = cdbDefault;
        this.cdbIpDefault = cdbIpDefault;
    }

    /**
     * @return All connection strings to use to connect to the Database.
     * 
     */
    public Map<String,Object> allConnectionStrings() {
        return this.allConnectionStrings;
    }
    /**
     * @return Host name based CDB Connection String.
     * 
     */
    public String cdbDefault() {
        return this.cdbDefault;
    }
    /**
     * @return IP based CDB Connection String.
     * 
     */
    public String cdbIpDefault() {
        return this.cdbIpDefault;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatabaseConnectionString defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,Object> allConnectionStrings;
        private String cdbDefault;
        private String cdbIpDefault;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDatabaseConnectionString defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allConnectionStrings = defaults.allConnectionStrings;
    	      this.cdbDefault = defaults.cdbDefault;
    	      this.cdbIpDefault = defaults.cdbIpDefault;
        }

        public Builder allConnectionStrings(Map<String,Object> allConnectionStrings) {
            this.allConnectionStrings = Objects.requireNonNull(allConnectionStrings);
            return this;
        }
        public Builder cdbDefault(String cdbDefault) {
            this.cdbDefault = Objects.requireNonNull(cdbDefault);
            return this;
        }
        public Builder cdbIpDefault(String cdbIpDefault) {
            this.cdbIpDefault = Objects.requireNonNull(cdbIpDefault);
            return this;
        }        public GetDatabaseConnectionString build() {
            return new GetDatabaseConnectionString(allConnectionStrings, cdbDefault, cdbIpDefault);
        }
    }
}

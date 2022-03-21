// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.purview.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AccountPropertiesResponseEndpoints {
    /**
     * Gets the catalog endpoint.
     * 
     */
    private final String catalog;
    /**
     * Gets the guardian endpoint.
     * 
     */
    private final String guardian;
    /**
     * Gets the scan endpoint.
     * 
     */
    private final String scan;

    @CustomType.Constructor
    private AccountPropertiesResponseEndpoints(
        @CustomType.Parameter("catalog") String catalog,
        @CustomType.Parameter("guardian") String guardian,
        @CustomType.Parameter("scan") String scan) {
        this.catalog = catalog;
        this.guardian = guardian;
        this.scan = scan;
    }

    /**
     * Gets the catalog endpoint.
     * 
    */
    public String getCatalog() {
        return this.catalog;
    }
    /**
     * Gets the guardian endpoint.
     * 
    */
    public String getGuardian() {
        return this.guardian;
    }
    /**
     * Gets the scan endpoint.
     * 
    */
    public String getScan() {
        return this.scan;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountPropertiesResponseEndpoints defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String catalog;
        private String guardian;
        private String scan;

        public Builder() {
    	      // Empty
        }

        public Builder(AccountPropertiesResponseEndpoints defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalog = defaults.catalog;
    	      this.guardian = defaults.guardian;
    	      this.scan = defaults.scan;
        }

        public Builder catalog(String catalog) {
            this.catalog = Objects.requireNonNull(catalog);
            return this;
        }
        public Builder guardian(String guardian) {
            this.guardian = Objects.requireNonNull(guardian);
            return this;
        }
        public Builder scan(String scan) {
            this.scan = Objects.requireNonNull(scan);
            return this;
        }        public AccountPropertiesResponseEndpoints build() {
            return new AccountPropertiesResponseEndpoints(catalog, guardian, scan);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Jms.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetInstallationSiteItemJre {
    /**
     * @return The distribution of a Java Runtime is the name of the lineage of product to which it belongs, for example _Java(TM) SE Runtime Environment_.
     * 
     */
    private final String distribution;
    /**
     * @return The unique identifier for a Java Runtime.
     * 
     */
    private final String jreKey;
    /**
     * @return The vendor of the Java Runtime.
     * 
     */
    private final String vendor;
    /**
     * @return The version of the operating system as provided by the Java system property os.version.
     * 
     */
    private final String version;

    @CustomType.Constructor
    private GetInstallationSiteItemJre(
        @CustomType.Parameter("distribution") String distribution,
        @CustomType.Parameter("jreKey") String jreKey,
        @CustomType.Parameter("vendor") String vendor,
        @CustomType.Parameter("version") String version) {
        this.distribution = distribution;
        this.jreKey = jreKey;
        this.vendor = vendor;
        this.version = version;
    }

    /**
     * @return The distribution of a Java Runtime is the name of the lineage of product to which it belongs, for example _Java(TM) SE Runtime Environment_.
     * 
     */
    public String distribution() {
        return this.distribution;
    }
    /**
     * @return The unique identifier for a Java Runtime.
     * 
     */
    public String jreKey() {
        return this.jreKey;
    }
    /**
     * @return The vendor of the Java Runtime.
     * 
     */
    public String vendor() {
        return this.vendor;
    }
    /**
     * @return The version of the operating system as provided by the Java system property os.version.
     * 
     */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstallationSiteItemJre defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String distribution;
        private String jreKey;
        private String vendor;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstallationSiteItemJre defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.distribution = defaults.distribution;
    	      this.jreKey = defaults.jreKey;
    	      this.vendor = defaults.vendor;
    	      this.version = defaults.version;
        }

        public Builder distribution(String distribution) {
            this.distribution = Objects.requireNonNull(distribution);
            return this;
        }
        public Builder jreKey(String jreKey) {
            this.jreKey = Objects.requireNonNull(jreKey);
            return this;
        }
        public Builder vendor(String vendor) {
            this.vendor = Objects.requireNonNull(vendor);
            return this;
        }
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }        public GetInstallationSiteItemJre build() {
            return new GetInstallationSiteItemJre(distribution, jreKey, vendor, version);
        }
    }
}

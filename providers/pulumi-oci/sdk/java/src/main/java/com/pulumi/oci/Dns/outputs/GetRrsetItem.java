// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Dns.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetRrsetItem {
    /**
     * @return The target fully-qualified domain name (FQDN) within the target zone.
     * 
     */
    private final String domain;
    /**
     * @return A Boolean flag indicating whether or not parts of the record are unable to be explicitly managed.
     * 
     */
    private final Boolean isProtected;
    /**
     * @return The record&#39;s data, as whitespace-delimited tokens in type-specific presentation format. All RDATA is normalized and the returned presentation of your RDATA may differ from its initial input. For more information about RDATA, see [Supported DNS Resource Record Types](https://docs.cloud.oracle.com/iaas/Content/DNS/Reference/supporteddnsresource.htm)
     * 
     */
    private final String rdata;
    /**
     * @return A unique identifier for the record within its zone.
     * 
     */
    private final String recordHash;
    /**
     * @return The latest version of the record&#39;s zone in which its RRSet differs from the preceding version.
     * 
     */
    private final String rrsetVersion;
    /**
     * @return The type of the target RRSet within the target zone.
     * 
     */
    private final String rtype;
    /**
     * @return The Time To Live for the record, in seconds.
     * 
     */
    private final Integer ttl;

    @CustomType.Constructor
    private GetRrsetItem(
        @CustomType.Parameter("domain") String domain,
        @CustomType.Parameter("isProtected") Boolean isProtected,
        @CustomType.Parameter("rdata") String rdata,
        @CustomType.Parameter("recordHash") String recordHash,
        @CustomType.Parameter("rrsetVersion") String rrsetVersion,
        @CustomType.Parameter("rtype") String rtype,
        @CustomType.Parameter("ttl") Integer ttl) {
        this.domain = domain;
        this.isProtected = isProtected;
        this.rdata = rdata;
        this.recordHash = recordHash;
        this.rrsetVersion = rrsetVersion;
        this.rtype = rtype;
        this.ttl = ttl;
    }

    /**
     * @return The target fully-qualified domain name (FQDN) within the target zone.
     * 
     */
    public String domain() {
        return this.domain;
    }
    /**
     * @return A Boolean flag indicating whether or not parts of the record are unable to be explicitly managed.
     * 
     */
    public Boolean isProtected() {
        return this.isProtected;
    }
    /**
     * @return The record&#39;s data, as whitespace-delimited tokens in type-specific presentation format. All RDATA is normalized and the returned presentation of your RDATA may differ from its initial input. For more information about RDATA, see [Supported DNS Resource Record Types](https://docs.cloud.oracle.com/iaas/Content/DNS/Reference/supporteddnsresource.htm)
     * 
     */
    public String rdata() {
        return this.rdata;
    }
    /**
     * @return A unique identifier for the record within its zone.
     * 
     */
    public String recordHash() {
        return this.recordHash;
    }
    /**
     * @return The latest version of the record&#39;s zone in which its RRSet differs from the preceding version.
     * 
     */
    public String rrsetVersion() {
        return this.rrsetVersion;
    }
    /**
     * @return The type of the target RRSet within the target zone.
     * 
     */
    public String rtype() {
        return this.rtype;
    }
    /**
     * @return The Time To Live for the record, in seconds.
     * 
     */
    public Integer ttl() {
        return this.ttl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRrsetItem defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String domain;
        private Boolean isProtected;
        private String rdata;
        private String recordHash;
        private String rrsetVersion;
        private String rtype;
        private Integer ttl;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRrsetItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domain = defaults.domain;
    	      this.isProtected = defaults.isProtected;
    	      this.rdata = defaults.rdata;
    	      this.recordHash = defaults.recordHash;
    	      this.rrsetVersion = defaults.rrsetVersion;
    	      this.rtype = defaults.rtype;
    	      this.ttl = defaults.ttl;
        }

        public Builder domain(String domain) {
            this.domain = Objects.requireNonNull(domain);
            return this;
        }
        public Builder isProtected(Boolean isProtected) {
            this.isProtected = Objects.requireNonNull(isProtected);
            return this;
        }
        public Builder rdata(String rdata) {
            this.rdata = Objects.requireNonNull(rdata);
            return this;
        }
        public Builder recordHash(String recordHash) {
            this.recordHash = Objects.requireNonNull(recordHash);
            return this;
        }
        public Builder rrsetVersion(String rrsetVersion) {
            this.rrsetVersion = Objects.requireNonNull(rrsetVersion);
            return this;
        }
        public Builder rtype(String rtype) {
            this.rtype = Objects.requireNonNull(rtype);
            return this;
        }
        public Builder ttl(Integer ttl) {
            this.ttl = Objects.requireNonNull(ttl);
            return this;
        }        public GetRrsetItem build() {
            return new GetRrsetItem(domain, isProtected, rdata, recordHash, rrsetVersion, rtype, ttl);
        }
    }
}

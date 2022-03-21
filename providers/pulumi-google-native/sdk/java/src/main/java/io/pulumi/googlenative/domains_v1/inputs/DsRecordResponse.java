// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.domains_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Defines a Delegation Signer (DS) record, which is needed to enable DNSSEC for a domain. It contains a digest (hash) of a DNSKEY record that must be present in the domain's DNS zone.
 * 
 */
public final class DsRecordResponse extends io.pulumi.resources.InvokeArgs {

    public static final DsRecordResponse Empty = new DsRecordResponse();

    /**
     * The algorithm used to generate the referenced DNSKEY.
     * 
     */
    @Import(name="algorithm", required=true)
      private final String algorithm;

    public String getAlgorithm() {
        return this.algorithm;
    }

    /**
     * The digest generated from the referenced DNSKEY.
     * 
     */
    @Import(name="digest", required=true)
      private final String digest;

    public String getDigest() {
        return this.digest;
    }

    /**
     * The hash function used to generate the digest of the referenced DNSKEY.
     * 
     */
    @Import(name="digestType", required=true)
      private final String digestType;

    public String getDigestType() {
        return this.digestType;
    }

    /**
     * The key tag of the record. Must be set in range 0 -- 65535.
     * 
     */
    @Import(name="keyTag", required=true)
      private final Integer keyTag;

    public Integer getKeyTag() {
        return this.keyTag;
    }

    public DsRecordResponse(
        String algorithm,
        String digest,
        String digestType,
        Integer keyTag) {
        this.algorithm = Objects.requireNonNull(algorithm, "expected parameter 'algorithm' to be non-null");
        this.digest = Objects.requireNonNull(digest, "expected parameter 'digest' to be non-null");
        this.digestType = Objects.requireNonNull(digestType, "expected parameter 'digestType' to be non-null");
        this.keyTag = Objects.requireNonNull(keyTag, "expected parameter 'keyTag' to be non-null");
    }

    private DsRecordResponse() {
        this.algorithm = null;
        this.digest = null;
        this.digestType = null;
        this.keyTag = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DsRecordResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String algorithm;
        private String digest;
        private String digestType;
        private Integer keyTag;

        public Builder() {
    	      // Empty
        }

        public Builder(DsRecordResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithm = defaults.algorithm;
    	      this.digest = defaults.digest;
    	      this.digestType = defaults.digestType;
    	      this.keyTag = defaults.keyTag;
        }

        public Builder algorithm(String algorithm) {
            this.algorithm = Objects.requireNonNull(algorithm);
            return this;
        }
        public Builder digest(String digest) {
            this.digest = Objects.requireNonNull(digest);
            return this;
        }
        public Builder digestType(String digestType) {
            this.digestType = Objects.requireNonNull(digestType);
            return this;
        }
        public Builder keyTag(Integer keyTag) {
            this.keyTag = Objects.requireNonNull(keyTag);
            return this;
        }        public DsRecordResponse build() {
            return new DsRecordResponse(algorithm, digest, digestType, keyTag);
        }
    }
}

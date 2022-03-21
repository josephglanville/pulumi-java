// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class SubjectResponse {
    /**
     * "": "" Algorithms can be e.g. sha256, sha512 See https://github.com/in-toto/attestation/blob/main/spec/field_types.md#DigestSet
     * 
     */
    private final Map<String,String> digest;
    /**
     * name is the name of the Subject used here
     * 
     */
    private final String name;

    @CustomType.Constructor
    private SubjectResponse(
        @CustomType.Parameter("digest") Map<String,String> digest,
        @CustomType.Parameter("name") String name) {
        this.digest = digest;
        this.name = name;
    }

    /**
     * "": "" Algorithms can be e.g. sha256, sha512 See https://github.com/in-toto/attestation/blob/main/spec/field_types.md#DigestSet
     * 
    */
    public Map<String,String> getDigest() {
        return this.digest;
    }
    /**
     * name is the name of the Subject used here
     * 
    */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubjectResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> digest;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(SubjectResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.digest = defaults.digest;
    	      this.name = defaults.name;
        }

        public Builder digest(Map<String,String> digest) {
            this.digest = Objects.requireNonNull(digest);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public SubjectResponse build() {
            return new SubjectResponse(digest, name);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;

@CustomType
public final class CertificateTemplatePredefinedValuesPolicyId {
    /**
     * Required. The parts of an OID path. The most significant parts of the path come first.
     * 
     */
    private final List<Integer> objectIdPaths;

    @CustomType.Constructor
    private CertificateTemplatePredefinedValuesPolicyId(@CustomType.Parameter("objectIdPaths") List<Integer> objectIdPaths) {
        this.objectIdPaths = objectIdPaths;
    }

    /**
     * Required. The parts of an OID path. The most significant parts of the path come first.
     * 
    */
    public List<Integer> getObjectIdPaths() {
        return this.objectIdPaths;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateTemplatePredefinedValuesPolicyId defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<Integer> objectIdPaths;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateTemplatePredefinedValuesPolicyId defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.objectIdPaths = defaults.objectIdPaths;
        }

        public Builder objectIdPaths(List<Integer> objectIdPaths) {
            this.objectIdPaths = Objects.requireNonNull(objectIdPaths);
            return this;
        }
        public Builder objectIdPaths(Integer... objectIdPaths) {
            return objectIdPaths(List.of(objectIdPaths));
        }        public CertificateTemplatePredefinedValuesPolicyId build() {
            return new CertificateTemplatePredefinedValuesPolicyId(objectIdPaths);
        }
    }
}

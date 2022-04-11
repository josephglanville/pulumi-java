// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;


public final class CertificateTemplatePredefinedValuesKeyUsageUnknownExtendedKeyUsageArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateTemplatePredefinedValuesKeyUsageUnknownExtendedKeyUsageArgs Empty = new CertificateTemplatePredefinedValuesKeyUsageUnknownExtendedKeyUsageArgs();

    /**
     * Required. The parts of an OID path. The most significant parts of the path come first.
     * 
     */
    @Import(name="objectIdPaths", required=true)
      private final Output<List<Integer>> objectIdPaths;

    public Output<List<Integer>> getObjectIdPaths() {
        return this.objectIdPaths;
    }

    public CertificateTemplatePredefinedValuesKeyUsageUnknownExtendedKeyUsageArgs(Output<List<Integer>> objectIdPaths) {
        this.objectIdPaths = Objects.requireNonNull(objectIdPaths, "expected parameter 'objectIdPaths' to be non-null");
    }

    private CertificateTemplatePredefinedValuesKeyUsageUnknownExtendedKeyUsageArgs() {
        this.objectIdPaths = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateTemplatePredefinedValuesKeyUsageUnknownExtendedKeyUsageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<Integer>> objectIdPaths;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateTemplatePredefinedValuesKeyUsageUnknownExtendedKeyUsageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.objectIdPaths = defaults.objectIdPaths;
        }

        public Builder objectIdPaths(Output<List<Integer>> objectIdPaths) {
            this.objectIdPaths = Objects.requireNonNull(objectIdPaths);
            return this;
        }
        public Builder objectIdPaths(List<Integer> objectIdPaths) {
            this.objectIdPaths = Output.of(Objects.requireNonNull(objectIdPaths));
            return this;
        }
        public Builder objectIdPaths(Integer... objectIdPaths) {
            return objectIdPaths(List.of(objectIdPaths));
        }        public CertificateTemplatePredefinedValuesKeyUsageUnknownExtendedKeyUsageArgs build() {
            return new CertificateTemplatePredefinedValuesKeyUsageUnknownExtendedKeyUsageArgs(objectIdPaths);
        }
    }
}

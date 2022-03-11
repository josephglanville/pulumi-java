// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;


public final class CertificateConfigX509ConfigKeyUsageUnknownExtendedKeyUsageGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateConfigX509ConfigKeyUsageUnknownExtendedKeyUsageGetArgs Empty = new CertificateConfigX509ConfigKeyUsageUnknownExtendedKeyUsageGetArgs();

    /**
     * An ObjectId specifies an object identifier (OID). These provide context and describe types in ASN.1 messages.
     * 
     */
    @InputImport(name="objectIdPaths", required=true)
      private final Output<List<Integer>> objectIdPaths;

    public Output<List<Integer>> getObjectIdPaths() {
        return this.objectIdPaths;
    }

    public CertificateConfigX509ConfigKeyUsageUnknownExtendedKeyUsageGetArgs(Output<List<Integer>> objectIdPaths) {
        this.objectIdPaths = Objects.requireNonNull(objectIdPaths, "expected parameter 'objectIdPaths' to be non-null");
    }

    private CertificateConfigX509ConfigKeyUsageUnknownExtendedKeyUsageGetArgs() {
        this.objectIdPaths = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateConfigX509ConfigKeyUsageUnknownExtendedKeyUsageGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<Integer>> objectIdPaths;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateConfigX509ConfigKeyUsageUnknownExtendedKeyUsageGetArgs defaults) {
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
        public CertificateConfigX509ConfigKeyUsageUnknownExtendedKeyUsageGetArgs build() {
            return new CertificateConfigX509ConfigKeyUsageUnknownExtendedKeyUsageGetArgs(objectIdPaths);
        }
    }
}

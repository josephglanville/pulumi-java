// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * A list of PEM formatted certificates.
 * 
 */
public final class MediaGraphPemCertificateListArgs extends io.pulumi.resources.ResourceArgs {

    public static final MediaGraphPemCertificateListArgs Empty = new MediaGraphPemCertificateListArgs();

    /**
     * PEM formatted public certificates, one per entry.
     * 
     */
    @InputImport(name="certificates", required=true)
      private final Output<List<String>> certificates;

    public Output<List<String>> getCertificates() {
        return this.certificates;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.MediaGraphPemCertificateList'.
     * 
     */
    @InputImport(name="odataType", required=true)
      private final Output<String> odataType;

    public Output<String> getOdataType() {
        return this.odataType;
    }

    public MediaGraphPemCertificateListArgs(
        Output<List<String>> certificates,
        Output<String> odataType) {
        this.certificates = Objects.requireNonNull(certificates, "expected parameter 'certificates' to be non-null");
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
    }

    private MediaGraphPemCertificateListArgs() {
        this.certificates = Output.empty();
        this.odataType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MediaGraphPemCertificateListArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<String>> certificates;
        private Output<String> odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(MediaGraphPemCertificateListArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificates = defaults.certificates;
    	      this.odataType = defaults.odataType;
        }

        public Builder certificates(Output<List<String>> certificates) {
            this.certificates = Objects.requireNonNull(certificates);
            return this;
        }

        public Builder certificates(List<String> certificates) {
            this.certificates = Output.of(Objects.requireNonNull(certificates));
            return this;
        }

        public Builder odataType(Output<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder odataType(String odataType) {
            this.odataType = Output.of(Objects.requireNonNull(odataType));
            return this;
        }
        public MediaGraphPemCertificateListArgs build() {
            return new MediaGraphPemCertificateListArgs(certificates, odataType);
        }
    }
}

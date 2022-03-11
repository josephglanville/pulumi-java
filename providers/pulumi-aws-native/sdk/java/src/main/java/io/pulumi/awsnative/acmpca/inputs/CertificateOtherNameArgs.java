// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.acmpca.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Structure that contains X.509 OtherName information.
 * 
 */
public final class CertificateOtherNameArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateOtherNameArgs Empty = new CertificateOtherNameArgs();

    @InputImport(name="typeId", required=true)
      private final Output<String> typeId;

    public Output<String> getTypeId() {
        return this.typeId;
    }

    @InputImport(name="value", required=true)
      private final Output<String> value;

    public Output<String> getValue() {
        return this.value;
    }

    public CertificateOtherNameArgs(
        Output<String> typeId,
        Output<String> value) {
        this.typeId = Objects.requireNonNull(typeId, "expected parameter 'typeId' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private CertificateOtherNameArgs() {
        this.typeId = Output.empty();
        this.value = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateOtherNameArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> typeId;
        private Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateOtherNameArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.typeId = defaults.typeId;
    	      this.value = defaults.value;
        }

        public Builder typeId(Output<String> typeId) {
            this.typeId = Objects.requireNonNull(typeId);
            return this;
        }

        public Builder typeId(String typeId) {
            this.typeId = Output.of(Objects.requireNonNull(typeId));
            return this;
        }

        public Builder value(Output<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder value(String value) {
            this.value = Output.of(Objects.requireNonNull(value));
            return this;
        }
        public CertificateOtherNameArgs build() {
            return new CertificateOtherNameArgs(typeId, value);
        }
    }
}

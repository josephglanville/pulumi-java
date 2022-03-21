// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2InfoTypeArgs;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2PrimitiveTransformationArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A transformation to apply to text that is identified as a specific info_type.
 * 
 */
public final class GooglePrivacyDlpV2InfoTypeTransformationArgs extends io.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2InfoTypeTransformationArgs Empty = new GooglePrivacyDlpV2InfoTypeTransformationArgs();

    /**
     * InfoTypes to apply the transformation to. An empty list will cause this transformation to apply to all findings that correspond to infoTypes that were requested in `InspectConfig`.
     * 
     */
    @Import(name="infoTypes")
      private final @Nullable Output<List<GooglePrivacyDlpV2InfoTypeArgs>> infoTypes;

    public Output<List<GooglePrivacyDlpV2InfoTypeArgs>> getInfoTypes() {
        return this.infoTypes == null ? Output.empty() : this.infoTypes;
    }

    /**
     * Primitive transformation to apply to the infoType.
     * 
     */
    @Import(name="primitiveTransformation", required=true)
      private final Output<GooglePrivacyDlpV2PrimitiveTransformationArgs> primitiveTransformation;

    public Output<GooglePrivacyDlpV2PrimitiveTransformationArgs> getPrimitiveTransformation() {
        return this.primitiveTransformation;
    }

    public GooglePrivacyDlpV2InfoTypeTransformationArgs(
        @Nullable Output<List<GooglePrivacyDlpV2InfoTypeArgs>> infoTypes,
        Output<GooglePrivacyDlpV2PrimitiveTransformationArgs> primitiveTransformation) {
        this.infoTypes = infoTypes;
        this.primitiveTransformation = Objects.requireNonNull(primitiveTransformation, "expected parameter 'primitiveTransformation' to be non-null");
    }

    private GooglePrivacyDlpV2InfoTypeTransformationArgs() {
        this.infoTypes = Output.empty();
        this.primitiveTransformation = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2InfoTypeTransformationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<GooglePrivacyDlpV2InfoTypeArgs>> infoTypes;
        private Output<GooglePrivacyDlpV2PrimitiveTransformationArgs> primitiveTransformation;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2InfoTypeTransformationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.infoTypes = defaults.infoTypes;
    	      this.primitiveTransformation = defaults.primitiveTransformation;
        }

        public Builder infoTypes(@Nullable Output<List<GooglePrivacyDlpV2InfoTypeArgs>> infoTypes) {
            this.infoTypes = infoTypes;
            return this;
        }
        public Builder infoTypes(@Nullable List<GooglePrivacyDlpV2InfoTypeArgs> infoTypes) {
            this.infoTypes = Output.ofNullable(infoTypes);
            return this;
        }
        public Builder infoTypes(GooglePrivacyDlpV2InfoTypeArgs... infoTypes) {
            return infoTypes(List.of(infoTypes));
        }
        public Builder primitiveTransformation(Output<GooglePrivacyDlpV2PrimitiveTransformationArgs> primitiveTransformation) {
            this.primitiveTransformation = Objects.requireNonNull(primitiveTransformation);
            return this;
        }
        public Builder primitiveTransformation(GooglePrivacyDlpV2PrimitiveTransformationArgs primitiveTransformation) {
            this.primitiveTransformation = Output.of(Objects.requireNonNull(primitiveTransformation));
            return this;
        }        public GooglePrivacyDlpV2InfoTypeTransformationArgs build() {
            return new GooglePrivacyDlpV2InfoTypeTransformationArgs(infoTypes, primitiveTransformation);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.inputs.ContentKeyPolicyPlayReadyLicenseArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ContentKeyPolicyPlayReadyConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContentKeyPolicyPlayReadyConfigurationArgs Empty = new ContentKeyPolicyPlayReadyConfigurationArgs();

    @InputImport(name="licenses", required=true)
    private final Input<List<ContentKeyPolicyPlayReadyLicenseArgs>> licenses;

    public Input<List<ContentKeyPolicyPlayReadyLicenseArgs>> getLicenses() {
        return this.licenses;
    }

    @InputImport(name="odataType", required=true)
    private final Input<String> odataType;

    public Input<String> getOdataType() {
        return this.odataType;
    }

    @InputImport(name="responseCustomData")
    private final @Nullable Input<String> responseCustomData;

    public Input<String> getResponseCustomData() {
        return this.responseCustomData == null ? Input.empty() : this.responseCustomData;
    }

    public ContentKeyPolicyPlayReadyConfigurationArgs(
        Input<List<ContentKeyPolicyPlayReadyLicenseArgs>> licenses,
        Input<String> odataType,
        @Nullable Input<String> responseCustomData) {
        this.licenses = Objects.requireNonNull(licenses, "expected parameter 'licenses' to be non-null");
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.responseCustomData = responseCustomData;
    }

    private ContentKeyPolicyPlayReadyConfigurationArgs() {
        this.licenses = Input.empty();
        this.odataType = Input.empty();
        this.responseCustomData = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentKeyPolicyPlayReadyConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<ContentKeyPolicyPlayReadyLicenseArgs>> licenses;
        private Input<String> odataType;
        private @Nullable Input<String> responseCustomData;

        public Builder() {
    	      // Empty
        }

        public Builder(ContentKeyPolicyPlayReadyConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.licenses = defaults.licenses;
    	      this.odataType = defaults.odataType;
    	      this.responseCustomData = defaults.responseCustomData;
        }

        public Builder setLicenses(Input<List<ContentKeyPolicyPlayReadyLicenseArgs>> licenses) {
            this.licenses = Objects.requireNonNull(licenses);
            return this;
        }

        public Builder setLicenses(List<ContentKeyPolicyPlayReadyLicenseArgs> licenses) {
            this.licenses = Input.of(Objects.requireNonNull(licenses));
            return this;
        }

        public Builder setOdataType(Input<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Input.of(Objects.requireNonNull(odataType));
            return this;
        }

        public Builder setResponseCustomData(@Nullable Input<String> responseCustomData) {
            this.responseCustomData = responseCustomData;
            return this;
        }

        public Builder setResponseCustomData(@Nullable String responseCustomData) {
            this.responseCustomData = Input.ofNullable(responseCustomData);
            return this;
        }

        public ContentKeyPolicyPlayReadyConfigurationArgs build() {
            return new ContentKeyPolicyPlayReadyConfigurationArgs(licenses, odataType, responseCustomData);
        }
    }
}

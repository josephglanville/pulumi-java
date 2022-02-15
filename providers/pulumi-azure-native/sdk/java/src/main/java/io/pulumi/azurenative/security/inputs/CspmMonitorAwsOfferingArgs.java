// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.azurenative.security.inputs.CspmMonitorAwsOfferingNativeCloudConnectionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CspmMonitorAwsOfferingArgs extends io.pulumi.resources.ResourceArgs {

    public static final CspmMonitorAwsOfferingArgs Empty = new CspmMonitorAwsOfferingArgs();

    @InputImport(name="nativeCloudConnection")
    private final @Nullable Input<CspmMonitorAwsOfferingNativeCloudConnectionArgs> nativeCloudConnection;

    public Input<CspmMonitorAwsOfferingNativeCloudConnectionArgs> getNativeCloudConnection() {
        return this.nativeCloudConnection == null ? Input.empty() : this.nativeCloudConnection;
    }

    @InputImport(name="offeringType", required=true)
    private final Input<String> offeringType;

    public Input<String> getOfferingType() {
        return this.offeringType;
    }

    public CspmMonitorAwsOfferingArgs(
        @Nullable Input<CspmMonitorAwsOfferingNativeCloudConnectionArgs> nativeCloudConnection,
        Input<String> offeringType) {
        this.nativeCloudConnection = nativeCloudConnection;
        this.offeringType = Objects.requireNonNull(offeringType, "expected parameter 'offeringType' to be non-null");
    }

    private CspmMonitorAwsOfferingArgs() {
        this.nativeCloudConnection = Input.empty();
        this.offeringType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CspmMonitorAwsOfferingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<CspmMonitorAwsOfferingNativeCloudConnectionArgs> nativeCloudConnection;
        private Input<String> offeringType;

        public Builder() {
    	      // Empty
        }

        public Builder(CspmMonitorAwsOfferingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nativeCloudConnection = defaults.nativeCloudConnection;
    	      this.offeringType = defaults.offeringType;
        }

        public Builder setNativeCloudConnection(@Nullable Input<CspmMonitorAwsOfferingNativeCloudConnectionArgs> nativeCloudConnection) {
            this.nativeCloudConnection = nativeCloudConnection;
            return this;
        }

        public Builder setNativeCloudConnection(@Nullable CspmMonitorAwsOfferingNativeCloudConnectionArgs nativeCloudConnection) {
            this.nativeCloudConnection = Input.ofNullable(nativeCloudConnection);
            return this;
        }

        public Builder setOfferingType(Input<String> offeringType) {
            this.offeringType = Objects.requireNonNull(offeringType);
            return this;
        }

        public Builder setOfferingType(String offeringType) {
            this.offeringType = Input.of(Objects.requireNonNull(offeringType));
            return this;
        }

        public CspmMonitorAwsOfferingArgs build() {
            return new CspmMonitorAwsOfferingArgs(nativeCloudConnection, offeringType);
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.azurenative.security.inputs.CspmMonitorAwsOfferingResponseNativeCloudConnection;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The CSPM monitoring for AWS offering configurations
 * 
 */
public final class CspmMonitorAwsOfferingResponse extends io.pulumi.resources.InvokeArgs {

    public static final CspmMonitorAwsOfferingResponse Empty = new CspmMonitorAwsOfferingResponse();

    /**
     * The offering description.
     * 
     */
    @Import(name="description", required=true)
      private final String description;

    public String getDescription() {
        return this.description;
    }

    /**
     * The native cloud connection configuration
     * 
     */
    @Import(name="nativeCloudConnection")
      private final @Nullable CspmMonitorAwsOfferingResponseNativeCloudConnection nativeCloudConnection;

    public Optional<CspmMonitorAwsOfferingResponseNativeCloudConnection> getNativeCloudConnection() {
        return this.nativeCloudConnection == null ? Optional.empty() : Optional.ofNullable(this.nativeCloudConnection);
    }

    /**
     * The type of the security offering.
     * Expected value is 'CspmMonitorAws'.
     * 
     */
    @Import(name="offeringType", required=true)
      private final String offeringType;

    public String getOfferingType() {
        return this.offeringType;
    }

    public CspmMonitorAwsOfferingResponse(
        String description,
        @Nullable CspmMonitorAwsOfferingResponseNativeCloudConnection nativeCloudConnection,
        String offeringType) {
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.nativeCloudConnection = nativeCloudConnection;
        this.offeringType = Objects.requireNonNull(offeringType, "expected parameter 'offeringType' to be non-null");
    }

    private CspmMonitorAwsOfferingResponse() {
        this.description = null;
        this.nativeCloudConnection = null;
        this.offeringType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CspmMonitorAwsOfferingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private @Nullable CspmMonitorAwsOfferingResponseNativeCloudConnection nativeCloudConnection;
        private String offeringType;

        public Builder() {
    	      // Empty
        }

        public Builder(CspmMonitorAwsOfferingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.nativeCloudConnection = defaults.nativeCloudConnection;
    	      this.offeringType = defaults.offeringType;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder nativeCloudConnection(@Nullable CspmMonitorAwsOfferingResponseNativeCloudConnection nativeCloudConnection) {
            this.nativeCloudConnection = nativeCloudConnection;
            return this;
        }
        public Builder offeringType(String offeringType) {
            this.offeringType = Objects.requireNonNull(offeringType);
            return this;
        }        public CspmMonitorAwsOfferingResponse build() {
            return new CspmMonitorAwsOfferingResponse(description, nativeCloudConnection, offeringType);
        }
    }
}

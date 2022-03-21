// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.inputs;

import io.pulumi.azurenative.botservice.inputs.LineRegistrationResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * The parameters to provide for the Line channel.
 * 
 */
public final class LineChannelPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final LineChannelPropertiesResponse Empty = new LineChannelPropertiesResponse();

    /**
     * Callback Url to enter in line registration.
     * 
     */
    @Import(name="callbackUrl", required=true)
      private final String callbackUrl;

    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    /**
     * Whether this channel is validated for the bot
     * 
     */
    @Import(name="isValidated", required=true)
      private final Boolean isValidated;

    public Boolean getIsValidated() {
        return this.isValidated;
    }

    /**
     * The list of line channel registrations
     * 
     */
    @Import(name="lineRegistrations", required=true)
      private final List<LineRegistrationResponse> lineRegistrations;

    public List<LineRegistrationResponse> getLineRegistrations() {
        return this.lineRegistrations;
    }

    public LineChannelPropertiesResponse(
        String callbackUrl,
        Boolean isValidated,
        List<LineRegistrationResponse> lineRegistrations) {
        this.callbackUrl = Objects.requireNonNull(callbackUrl, "expected parameter 'callbackUrl' to be non-null");
        this.isValidated = Objects.requireNonNull(isValidated, "expected parameter 'isValidated' to be non-null");
        this.lineRegistrations = Objects.requireNonNull(lineRegistrations, "expected parameter 'lineRegistrations' to be non-null");
    }

    private LineChannelPropertiesResponse() {
        this.callbackUrl = null;
        this.isValidated = null;
        this.lineRegistrations = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LineChannelPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String callbackUrl;
        private Boolean isValidated;
        private List<LineRegistrationResponse> lineRegistrations;

        public Builder() {
    	      // Empty
        }

        public Builder(LineChannelPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.callbackUrl = defaults.callbackUrl;
    	      this.isValidated = defaults.isValidated;
    	      this.lineRegistrations = defaults.lineRegistrations;
        }

        public Builder callbackUrl(String callbackUrl) {
            this.callbackUrl = Objects.requireNonNull(callbackUrl);
            return this;
        }
        public Builder isValidated(Boolean isValidated) {
            this.isValidated = Objects.requireNonNull(isValidated);
            return this;
        }
        public Builder lineRegistrations(List<LineRegistrationResponse> lineRegistrations) {
            this.lineRegistrations = Objects.requireNonNull(lineRegistrations);
            return this;
        }
        public Builder lineRegistrations(LineRegistrationResponse... lineRegistrations) {
            return lineRegistrations(List.of(lineRegistrations));
        }        public LineChannelPropertiesResponse build() {
            return new LineChannelPropertiesResponse(callbackUrl, isValidated, lineRegistrations);
        }
    }
}

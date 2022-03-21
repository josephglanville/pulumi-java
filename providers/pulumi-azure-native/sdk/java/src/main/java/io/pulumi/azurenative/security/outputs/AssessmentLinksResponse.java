// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AssessmentLinksResponse {
    /**
     * Link to assessment in Azure Portal
     * 
     */
    private final String azurePortalUri;

    @CustomType.Constructor
    private AssessmentLinksResponse(@CustomType.Parameter("azurePortalUri") String azurePortalUri) {
        this.azurePortalUri = azurePortalUri;
    }

    /**
     * Link to assessment in Azure Portal
     * 
    */
    public String getAzurePortalUri() {
        return this.azurePortalUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssessmentLinksResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String azurePortalUri;

        public Builder() {
    	      // Empty
        }

        public Builder(AssessmentLinksResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azurePortalUri = defaults.azurePortalUri;
        }

        public Builder azurePortalUri(String azurePortalUri) {
            this.azurePortalUri = Objects.requireNonNull(azurePortalUri);
            return this;
        }        public AssessmentLinksResponse build() {
            return new AssessmentLinksResponse(azurePortalUri);
        }
    }
}

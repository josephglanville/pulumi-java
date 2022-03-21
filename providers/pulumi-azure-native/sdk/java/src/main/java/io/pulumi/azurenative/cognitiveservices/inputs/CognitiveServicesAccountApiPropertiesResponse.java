// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cognitiveservices.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The api properties for special APIs.
 * 
 */
public final class CognitiveServicesAccountApiPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final CognitiveServicesAccountApiPropertiesResponse Empty = new CognitiveServicesAccountApiPropertiesResponse();

    /**
     * (Metrics Advisor Only) The Azure AD Client Id (Application Id).
     * 
     */
    @Import(name="aadClientId")
      private final @Nullable String aadClientId;

    public Optional<String> getAadClientId() {
        return this.aadClientId == null ? Optional.empty() : Optional.ofNullable(this.aadClientId);
    }

    /**
     * (Metrics Advisor Only) The Azure AD Tenant Id.
     * 
     */
    @Import(name="aadTenantId")
      private final @Nullable String aadTenantId;

    public Optional<String> getAadTenantId() {
        return this.aadTenantId == null ? Optional.empty() : Optional.ofNullable(this.aadTenantId);
    }

    /**
     * (Personalization Only) The flag to enable statistics of Bing Search.
     * 
     */
    @Import(name="eventHubConnectionString")
      private final @Nullable String eventHubConnectionString;

    public Optional<String> getEventHubConnectionString() {
        return this.eventHubConnectionString == null ? Optional.empty() : Optional.ofNullable(this.eventHubConnectionString);
    }

    /**
     * (QnAMaker Only) The Azure Search endpoint id of QnAMaker.
     * 
     */
    @Import(name="qnaAzureSearchEndpointId")
      private final @Nullable String qnaAzureSearchEndpointId;

    public Optional<String> getQnaAzureSearchEndpointId() {
        return this.qnaAzureSearchEndpointId == null ? Optional.empty() : Optional.ofNullable(this.qnaAzureSearchEndpointId);
    }

    /**
     * (QnAMaker Only) The Azure Search endpoint key of QnAMaker.
     * 
     */
    @Import(name="qnaAzureSearchEndpointKey")
      private final @Nullable String qnaAzureSearchEndpointKey;

    public Optional<String> getQnaAzureSearchEndpointKey() {
        return this.qnaAzureSearchEndpointKey == null ? Optional.empty() : Optional.ofNullable(this.qnaAzureSearchEndpointKey);
    }

    /**
     * (QnAMaker Only) The runtime endpoint of QnAMaker.
     * 
     */
    @Import(name="qnaRuntimeEndpoint")
      private final @Nullable String qnaRuntimeEndpoint;

    public Optional<String> getQnaRuntimeEndpoint() {
        return this.qnaRuntimeEndpoint == null ? Optional.empty() : Optional.ofNullable(this.qnaRuntimeEndpoint);
    }

    /**
     * (Bing Search Only) The flag to enable statistics of Bing Search.
     * 
     */
    @Import(name="statisticsEnabled")
      private final @Nullable Boolean statisticsEnabled;

    public Optional<Boolean> getStatisticsEnabled() {
        return this.statisticsEnabled == null ? Optional.empty() : Optional.ofNullable(this.statisticsEnabled);
    }

    /**
     * (Personalization Only) The storage account connection string.
     * 
     */
    @Import(name="storageAccountConnectionString")
      private final @Nullable String storageAccountConnectionString;

    public Optional<String> getStorageAccountConnectionString() {
        return this.storageAccountConnectionString == null ? Optional.empty() : Optional.ofNullable(this.storageAccountConnectionString);
    }

    /**
     * (Metrics Advisor Only) The super user of Metrics Advisor.
     * 
     */
    @Import(name="superUser")
      private final @Nullable String superUser;

    public Optional<String> getSuperUser() {
        return this.superUser == null ? Optional.empty() : Optional.ofNullable(this.superUser);
    }

    /**
     * (Metrics Advisor Only) The website name of Metrics Advisor.
     * 
     */
    @Import(name="websiteName")
      private final @Nullable String websiteName;

    public Optional<String> getWebsiteName() {
        return this.websiteName == null ? Optional.empty() : Optional.ofNullable(this.websiteName);
    }

    public CognitiveServicesAccountApiPropertiesResponse(
        @Nullable String aadClientId,
        @Nullable String aadTenantId,
        @Nullable String eventHubConnectionString,
        @Nullable String qnaAzureSearchEndpointId,
        @Nullable String qnaAzureSearchEndpointKey,
        @Nullable String qnaRuntimeEndpoint,
        @Nullable Boolean statisticsEnabled,
        @Nullable String storageAccountConnectionString,
        @Nullable String superUser,
        @Nullable String websiteName) {
        this.aadClientId = aadClientId;
        this.aadTenantId = aadTenantId;
        this.eventHubConnectionString = eventHubConnectionString;
        this.qnaAzureSearchEndpointId = qnaAzureSearchEndpointId;
        this.qnaAzureSearchEndpointKey = qnaAzureSearchEndpointKey;
        this.qnaRuntimeEndpoint = qnaRuntimeEndpoint;
        this.statisticsEnabled = statisticsEnabled;
        this.storageAccountConnectionString = storageAccountConnectionString;
        this.superUser = superUser;
        this.websiteName = websiteName;
    }

    private CognitiveServicesAccountApiPropertiesResponse() {
        this.aadClientId = null;
        this.aadTenantId = null;
        this.eventHubConnectionString = null;
        this.qnaAzureSearchEndpointId = null;
        this.qnaAzureSearchEndpointKey = null;
        this.qnaRuntimeEndpoint = null;
        this.statisticsEnabled = null;
        this.storageAccountConnectionString = null;
        this.superUser = null;
        this.websiteName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CognitiveServicesAccountApiPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String aadClientId;
        private @Nullable String aadTenantId;
        private @Nullable String eventHubConnectionString;
        private @Nullable String qnaAzureSearchEndpointId;
        private @Nullable String qnaAzureSearchEndpointKey;
        private @Nullable String qnaRuntimeEndpoint;
        private @Nullable Boolean statisticsEnabled;
        private @Nullable String storageAccountConnectionString;
        private @Nullable String superUser;
        private @Nullable String websiteName;

        public Builder() {
    	      // Empty
        }

        public Builder(CognitiveServicesAccountApiPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aadClientId = defaults.aadClientId;
    	      this.aadTenantId = defaults.aadTenantId;
    	      this.eventHubConnectionString = defaults.eventHubConnectionString;
    	      this.qnaAzureSearchEndpointId = defaults.qnaAzureSearchEndpointId;
    	      this.qnaAzureSearchEndpointKey = defaults.qnaAzureSearchEndpointKey;
    	      this.qnaRuntimeEndpoint = defaults.qnaRuntimeEndpoint;
    	      this.statisticsEnabled = defaults.statisticsEnabled;
    	      this.storageAccountConnectionString = defaults.storageAccountConnectionString;
    	      this.superUser = defaults.superUser;
    	      this.websiteName = defaults.websiteName;
        }

        public Builder aadClientId(@Nullable String aadClientId) {
            this.aadClientId = aadClientId;
            return this;
        }
        public Builder aadTenantId(@Nullable String aadTenantId) {
            this.aadTenantId = aadTenantId;
            return this;
        }
        public Builder eventHubConnectionString(@Nullable String eventHubConnectionString) {
            this.eventHubConnectionString = eventHubConnectionString;
            return this;
        }
        public Builder qnaAzureSearchEndpointId(@Nullable String qnaAzureSearchEndpointId) {
            this.qnaAzureSearchEndpointId = qnaAzureSearchEndpointId;
            return this;
        }
        public Builder qnaAzureSearchEndpointKey(@Nullable String qnaAzureSearchEndpointKey) {
            this.qnaAzureSearchEndpointKey = qnaAzureSearchEndpointKey;
            return this;
        }
        public Builder qnaRuntimeEndpoint(@Nullable String qnaRuntimeEndpoint) {
            this.qnaRuntimeEndpoint = qnaRuntimeEndpoint;
            return this;
        }
        public Builder statisticsEnabled(@Nullable Boolean statisticsEnabled) {
            this.statisticsEnabled = statisticsEnabled;
            return this;
        }
        public Builder storageAccountConnectionString(@Nullable String storageAccountConnectionString) {
            this.storageAccountConnectionString = storageAccountConnectionString;
            return this;
        }
        public Builder superUser(@Nullable String superUser) {
            this.superUser = superUser;
            return this;
        }
        public Builder websiteName(@Nullable String websiteName) {
            this.websiteName = websiteName;
            return this;
        }        public CognitiveServicesAccountApiPropertiesResponse build() {
            return new CognitiveServicesAccountApiPropertiesResponse(aadClientId, aadTenantId, eventHubConnectionString, qnaAzureSearchEndpointId, qnaAzureSearchEndpointKey, qnaRuntimeEndpoint, statisticsEnabled, storageAccountConnectionString, superUser, websiteName);
        }
    }
}

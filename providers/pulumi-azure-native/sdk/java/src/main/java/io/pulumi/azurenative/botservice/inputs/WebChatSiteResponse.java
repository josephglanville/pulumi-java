// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * A site for the Webchat channel
 * 
 */
public final class WebChatSiteResponse extends io.pulumi.resources.InvokeArgs {

    public static final WebChatSiteResponse Empty = new WebChatSiteResponse();

    /**
     * Whether this site is enabled for DirectLine channel
     * 
     */
    @Import(name="isEnabled", required=true)
      private final Boolean isEnabled;

    public Boolean getIsEnabled() {
        return this.isEnabled;
    }

    /**
     * Whether this site is enabled for preview versions of Webchat
     * 
     */
    @Import(name="isWebchatPreviewEnabled", required=true)
      private final Boolean isWebchatPreviewEnabled;

    public Boolean getIsWebchatPreviewEnabled() {
        return this.isWebchatPreviewEnabled;
    }

    /**
     * Primary key. Value only returned through POST to the action Channel List API, otherwise empty.
     * 
     */
    @Import(name="key", required=true)
      private final String key;

    public String getKey() {
        return this.key;
    }

    /**
     * Secondary key. Value only returned through POST to the action Channel List API, otherwise empty.
     * 
     */
    @Import(name="key2", required=true)
      private final String key2;

    public String getKey2() {
        return this.key2;
    }

    /**
     * Site Id
     * 
     */
    @Import(name="siteId", required=true)
      private final String siteId;

    public String getSiteId() {
        return this.siteId;
    }

    /**
     * Site name
     * 
     */
    @Import(name="siteName", required=true)
      private final String siteName;

    public String getSiteName() {
        return this.siteName;
    }

    public WebChatSiteResponse(
        Boolean isEnabled,
        Boolean isWebchatPreviewEnabled,
        String key,
        String key2,
        String siteId,
        String siteName) {
        this.isEnabled = Objects.requireNonNull(isEnabled, "expected parameter 'isEnabled' to be non-null");
        this.isWebchatPreviewEnabled = isWebchatPreviewEnabled == null ? false : Objects.requireNonNull(isWebchatPreviewEnabled, "expected parameter 'isWebchatPreviewEnabled' to be non-null");
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.key2 = Objects.requireNonNull(key2, "expected parameter 'key2' to be non-null");
        this.siteId = Objects.requireNonNull(siteId, "expected parameter 'siteId' to be non-null");
        this.siteName = Objects.requireNonNull(siteName, "expected parameter 'siteName' to be non-null");
    }

    private WebChatSiteResponse() {
        this.isEnabled = null;
        this.isWebchatPreviewEnabled = null;
        this.key = null;
        this.key2 = null;
        this.siteId = null;
        this.siteName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebChatSiteResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean isEnabled;
        private Boolean isWebchatPreviewEnabled;
        private String key;
        private String key2;
        private String siteId;
        private String siteName;

        public Builder() {
    	      // Empty
        }

        public Builder(WebChatSiteResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isEnabled = defaults.isEnabled;
    	      this.isWebchatPreviewEnabled = defaults.isWebchatPreviewEnabled;
    	      this.key = defaults.key;
    	      this.key2 = defaults.key2;
    	      this.siteId = defaults.siteId;
    	      this.siteName = defaults.siteName;
        }

        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }
        public Builder isWebchatPreviewEnabled(Boolean isWebchatPreviewEnabled) {
            this.isWebchatPreviewEnabled = Objects.requireNonNull(isWebchatPreviewEnabled);
            return this;
        }
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder key2(String key2) {
            this.key2 = Objects.requireNonNull(key2);
            return this;
        }
        public Builder siteId(String siteId) {
            this.siteId = Objects.requireNonNull(siteId);
            return this;
        }
        public Builder siteName(String siteName) {
            this.siteName = Objects.requireNonNull(siteName);
            return this;
        }        public WebChatSiteResponse build() {
            return new WebChatSiteResponse(isEnabled, isWebchatPreviewEnabled, key, key2, siteId, siteName);
        }
    }
}

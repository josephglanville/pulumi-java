// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of a lab's announcement banner
 * 
 */
public final class LabAnnouncementPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final LabAnnouncementPropertiesResponse Empty = new LabAnnouncementPropertiesResponse();

    /**
     * Is the lab announcement active/enabled at this time?
     * 
     */
    @InputImport(name="enabled")
      private final @Nullable String enabled;

    public Optional<String> getEnabled() {
        return this.enabled == null ? Optional.empty() : Optional.ofNullable(this.enabled);
    }

    /**
     * The time at which the announcement expires (null for never)
     * 
     */
    @InputImport(name="expirationDate")
      private final @Nullable String expirationDate;

    public Optional<String> getExpirationDate() {
        return this.expirationDate == null ? Optional.empty() : Optional.ofNullable(this.expirationDate);
    }

    /**
     * Has this announcement expired?
     * 
     */
    @InputImport(name="expired")
      private final @Nullable Boolean expired;

    public Optional<Boolean> getExpired() {
        return this.expired == null ? Optional.empty() : Optional.ofNullable(this.expired);
    }

    /**
     * The markdown text (if any) that this lab displays in the UI. If left empty/null, nothing will be shown.
     * 
     */
    @InputImport(name="markdown")
      private final @Nullable String markdown;

    public Optional<String> getMarkdown() {
        return this.markdown == null ? Optional.empty() : Optional.ofNullable(this.markdown);
    }

    /**
     * The provisioning status of the resource.
     * 
     */
    @InputImport(name="provisioningState", required=true)
      private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * The plain text title for the lab announcement
     * 
     */
    @InputImport(name="title")
      private final @Nullable String title;

    public Optional<String> getTitle() {
        return this.title == null ? Optional.empty() : Optional.ofNullable(this.title);
    }

    /**
     * The unique immutable identifier of a resource (Guid).
     * 
     */
    @InputImport(name="uniqueIdentifier", required=true)
      private final String uniqueIdentifier;

    public String getUniqueIdentifier() {
        return this.uniqueIdentifier;
    }

    public LabAnnouncementPropertiesResponse(
        @Nullable String enabled,
        @Nullable String expirationDate,
        @Nullable Boolean expired,
        @Nullable String markdown,
        String provisioningState,
        @Nullable String title,
        String uniqueIdentifier) {
        this.enabled = enabled;
        this.expirationDate = expirationDate;
        this.expired = expired;
        this.markdown = markdown;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.title = title;
        this.uniqueIdentifier = Objects.requireNonNull(uniqueIdentifier, "expected parameter 'uniqueIdentifier' to be non-null");
    }

    private LabAnnouncementPropertiesResponse() {
        this.enabled = null;
        this.expirationDate = null;
        this.expired = null;
        this.markdown = null;
        this.provisioningState = null;
        this.title = null;
        this.uniqueIdentifier = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LabAnnouncementPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String enabled;
        private @Nullable String expirationDate;
        private @Nullable Boolean expired;
        private @Nullable String markdown;
        private String provisioningState;
        private @Nullable String title;
        private String uniqueIdentifier;

        public Builder() {
    	      // Empty
        }

        public Builder(LabAnnouncementPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.expirationDate = defaults.expirationDate;
    	      this.expired = defaults.expired;
    	      this.markdown = defaults.markdown;
    	      this.provisioningState = defaults.provisioningState;
    	      this.title = defaults.title;
    	      this.uniqueIdentifier = defaults.uniqueIdentifier;
        }

        public Builder setEnabled(@Nullable String enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setExpirationDate(@Nullable String expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }

        public Builder setExpired(@Nullable Boolean expired) {
            this.expired = expired;
            return this;
        }

        public Builder setMarkdown(@Nullable String markdown) {
            this.markdown = markdown;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setTitle(@Nullable String title) {
            this.title = title;
            return this;
        }

        public Builder setUniqueIdentifier(String uniqueIdentifier) {
            this.uniqueIdentifier = Objects.requireNonNull(uniqueIdentifier);
            return this;
        }
        public LabAnnouncementPropertiesResponse build() {
            return new LabAnnouncementPropertiesResponse(enabled, expirationDate, expired, markdown, provisioningState, title, uniqueIdentifier);
        }
    }
}

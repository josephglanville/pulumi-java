// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * LinkedService specific properties.
 * 
 */
public final class LinkedServicePropsResponse extends io.pulumi.resources.InvokeArgs {

    public static final LinkedServicePropsResponse Empty = new LinkedServicePropsResponse();

    /**
     * The creation time of the linked service.
     * 
     */
    @InputImport(name="createdTime")
      private final @Nullable String createdTime;

    public Optional<String> getCreatedTime() {
        return this.createdTime == null ? Optional.empty() : Optional.ofNullable(this.createdTime);
    }

    /**
     * Type of the link target.
     * 
     */
    @InputImport(name="linkType")
      private final @Nullable String linkType;

    public Optional<String> getLinkType() {
        return this.linkType == null ? Optional.empty() : Optional.ofNullable(this.linkType);
    }

    /**
     * ResourceId of the link target of the linked service.
     * 
     */
    @InputImport(name="linkedServiceResourceId", required=true)
      private final String linkedServiceResourceId;

    public String getLinkedServiceResourceId() {
        return this.linkedServiceResourceId;
    }

    /**
     * The last modified time of the linked service.
     * 
     */
    @InputImport(name="modifiedTime")
      private final @Nullable String modifiedTime;

    public Optional<String> getModifiedTime() {
        return this.modifiedTime == null ? Optional.empty() : Optional.ofNullable(this.modifiedTime);
    }

    public LinkedServicePropsResponse(
        @Nullable String createdTime,
        @Nullable String linkType,
        String linkedServiceResourceId,
        @Nullable String modifiedTime) {
        this.createdTime = createdTime;
        this.linkType = linkType;
        this.linkedServiceResourceId = Objects.requireNonNull(linkedServiceResourceId, "expected parameter 'linkedServiceResourceId' to be non-null");
        this.modifiedTime = modifiedTime;
    }

    private LinkedServicePropsResponse() {
        this.createdTime = null;
        this.linkType = null;
        this.linkedServiceResourceId = null;
        this.modifiedTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinkedServicePropsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String createdTime;
        private @Nullable String linkType;
        private String linkedServiceResourceId;
        private @Nullable String modifiedTime;

        public Builder() {
    	      // Empty
        }

        public Builder(LinkedServicePropsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdTime = defaults.createdTime;
    	      this.linkType = defaults.linkType;
    	      this.linkedServiceResourceId = defaults.linkedServiceResourceId;
    	      this.modifiedTime = defaults.modifiedTime;
        }

        public Builder setCreatedTime(@Nullable String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        public Builder setLinkType(@Nullable String linkType) {
            this.linkType = linkType;
            return this;
        }

        public Builder setLinkedServiceResourceId(String linkedServiceResourceId) {
            this.linkedServiceResourceId = Objects.requireNonNull(linkedServiceResourceId);
            return this;
        }

        public Builder setModifiedTime(@Nullable String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public LinkedServicePropsResponse build() {
            return new LinkedServicePropsResponse(createdTime, linkType, linkedServiceResourceId, modifiedTime);
        }
    }
}

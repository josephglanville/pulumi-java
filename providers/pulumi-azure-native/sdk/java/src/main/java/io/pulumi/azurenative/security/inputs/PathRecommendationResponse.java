// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.azurenative.security.inputs.PublisherInfoResponse;
import io.pulumi.azurenative.security.inputs.UserRecommendationResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents a path that is recommended to be allowed and its properties
 * 
 */
public final class PathRecommendationResponse extends io.pulumi.resources.InvokeArgs {

    public static final PathRecommendationResponse Empty = new PathRecommendationResponse();

    /**
     * The recommendation action of the machine or rule
     * 
     */
    @Import(name="action")
      private final @Nullable String action;

    public Optional<String> getAction() {
        return this.action == null ? Optional.empty() : Optional.ofNullable(this.action);
    }

    /**
     * Whether the application is commonly run on the machine
     * 
     */
    @Import(name="common")
      private final @Nullable Boolean common;

    public Optional<Boolean> getCommon() {
        return this.common == null ? Optional.empty() : Optional.ofNullable(this.common);
    }

    /**
     * The configuration status of the machines group or machine or rule
     * 
     */
    @Import(name="configurationStatus")
      private final @Nullable String configurationStatus;

    public Optional<String> getConfigurationStatus() {
        return this.configurationStatus == null ? Optional.empty() : Optional.ofNullable(this.configurationStatus);
    }

    /**
     * The type of the file (for Linux files - Executable is used)
     * 
     */
    @Import(name="fileType")
      private final @Nullable String fileType;

    public Optional<String> getFileType() {
        return this.fileType == null ? Optional.empty() : Optional.ofNullable(this.fileType);
    }

    /**
     * The full path of the file, or an identifier of the application
     * 
     */
    @Import(name="path")
      private final @Nullable String path;

    public Optional<String> getPath() {
        return this.path == null ? Optional.empty() : Optional.ofNullable(this.path);
    }

    /**
     * Represents the publisher information of a process/rule
     * 
     */
    @Import(name="publisherInfo")
      private final @Nullable PublisherInfoResponse publisherInfo;

    public Optional<PublisherInfoResponse> getPublisherInfo() {
        return this.publisherInfo == null ? Optional.empty() : Optional.ofNullable(this.publisherInfo);
    }

    /**
     * The type of the rule to be allowed
     * 
     */
    @Import(name="type")
      private final @Nullable String type;

    public Optional<String> getType() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    @Import(name="userSids")
      private final @Nullable List<String> userSids;

    public List<String> getUserSids() {
        return this.userSids == null ? List.of() : this.userSids;
    }

    @Import(name="usernames")
      private final @Nullable List<UserRecommendationResponse> usernames;

    public List<UserRecommendationResponse> getUsernames() {
        return this.usernames == null ? List.of() : this.usernames;
    }

    public PathRecommendationResponse(
        @Nullable String action,
        @Nullable Boolean common,
        @Nullable String configurationStatus,
        @Nullable String fileType,
        @Nullable String path,
        @Nullable PublisherInfoResponse publisherInfo,
        @Nullable String type,
        @Nullable List<String> userSids,
        @Nullable List<UserRecommendationResponse> usernames) {
        this.action = action;
        this.common = common;
        this.configurationStatus = configurationStatus;
        this.fileType = fileType;
        this.path = path;
        this.publisherInfo = publisherInfo;
        this.type = type;
        this.userSids = userSids;
        this.usernames = usernames;
    }

    private PathRecommendationResponse() {
        this.action = null;
        this.common = null;
        this.configurationStatus = null;
        this.fileType = null;
        this.path = null;
        this.publisherInfo = null;
        this.type = null;
        this.userSids = List.of();
        this.usernames = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PathRecommendationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String action;
        private @Nullable Boolean common;
        private @Nullable String configurationStatus;
        private @Nullable String fileType;
        private @Nullable String path;
        private @Nullable PublisherInfoResponse publisherInfo;
        private @Nullable String type;
        private @Nullable List<String> userSids;
        private @Nullable List<UserRecommendationResponse> usernames;

        public Builder() {
    	      // Empty
        }

        public Builder(PathRecommendationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.common = defaults.common;
    	      this.configurationStatus = defaults.configurationStatus;
    	      this.fileType = defaults.fileType;
    	      this.path = defaults.path;
    	      this.publisherInfo = defaults.publisherInfo;
    	      this.type = defaults.type;
    	      this.userSids = defaults.userSids;
    	      this.usernames = defaults.usernames;
        }

        public Builder action(@Nullable String action) {
            this.action = action;
            return this;
        }
        public Builder common(@Nullable Boolean common) {
            this.common = common;
            return this;
        }
        public Builder configurationStatus(@Nullable String configurationStatus) {
            this.configurationStatus = configurationStatus;
            return this;
        }
        public Builder fileType(@Nullable String fileType) {
            this.fileType = fileType;
            return this;
        }
        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }
        public Builder publisherInfo(@Nullable PublisherInfoResponse publisherInfo) {
            this.publisherInfo = publisherInfo;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public Builder userSids(@Nullable List<String> userSids) {
            this.userSids = userSids;
            return this;
        }
        public Builder userSids(String... userSids) {
            return userSids(List.of(userSids));
        }
        public Builder usernames(@Nullable List<UserRecommendationResponse> usernames) {
            this.usernames = usernames;
            return this;
        }
        public Builder usernames(UserRecommendationResponse... usernames) {
            return usernames(List.of(usernames));
        }        public PathRecommendationResponse build() {
            return new PathRecommendationResponse(action, common, configurationStatus, fileType, path, publisherInfo, type, userSids, usernames);
        }
    }
}

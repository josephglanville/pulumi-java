// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.outputs;

import io.pulumi.azurenative.security.outputs.PublisherInfoResponse;
import io.pulumi.azurenative.security.outputs.UserRecommendationResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PathRecommendationResponse {
    /**
     * The recommendation action of the machine or rule
     * 
     */
    private final @Nullable String action;
    /**
     * Whether the application is commonly run on the machine
     * 
     */
    private final @Nullable Boolean common;
    /**
     * The configuration status of the machines group or machine or rule
     * 
     */
    private final @Nullable String configurationStatus;
    /**
     * The type of the file (for Linux files - Executable is used)
     * 
     */
    private final @Nullable String fileType;
    /**
     * The full path of the file, or an identifier of the application
     * 
     */
    private final @Nullable String path;
    /**
     * Represents the publisher information of a process/rule
     * 
     */
    private final @Nullable PublisherInfoResponse publisherInfo;
    /**
     * The type of the rule to be allowed
     * 
     */
    private final @Nullable String type;
    private final @Nullable List<String> userSids;
    private final @Nullable List<UserRecommendationResponse> usernames;

    @CustomType.Constructor
    private PathRecommendationResponse(
        @CustomType.Parameter("action") @Nullable String action,
        @CustomType.Parameter("common") @Nullable Boolean common,
        @CustomType.Parameter("configurationStatus") @Nullable String configurationStatus,
        @CustomType.Parameter("fileType") @Nullable String fileType,
        @CustomType.Parameter("path") @Nullable String path,
        @CustomType.Parameter("publisherInfo") @Nullable PublisherInfoResponse publisherInfo,
        @CustomType.Parameter("type") @Nullable String type,
        @CustomType.Parameter("userSids") @Nullable List<String> userSids,
        @CustomType.Parameter("usernames") @Nullable List<UserRecommendationResponse> usernames) {
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

    /**
     * The recommendation action of the machine or rule
     * 
    */
    public Optional<String> getAction() {
        return Optional.ofNullable(this.action);
    }
    /**
     * Whether the application is commonly run on the machine
     * 
    */
    public Optional<Boolean> getCommon() {
        return Optional.ofNullable(this.common);
    }
    /**
     * The configuration status of the machines group or machine or rule
     * 
    */
    public Optional<String> getConfigurationStatus() {
        return Optional.ofNullable(this.configurationStatus);
    }
    /**
     * The type of the file (for Linux files - Executable is used)
     * 
    */
    public Optional<String> getFileType() {
        return Optional.ofNullable(this.fileType);
    }
    /**
     * The full path of the file, or an identifier of the application
     * 
    */
    public Optional<String> getPath() {
        return Optional.ofNullable(this.path);
    }
    /**
     * Represents the publisher information of a process/rule
     * 
    */
    public Optional<PublisherInfoResponse> getPublisherInfo() {
        return Optional.ofNullable(this.publisherInfo);
    }
    /**
     * The type of the rule to be allowed
     * 
    */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }
    public List<String> getUserSids() {
        return this.userSids == null ? List.of() : this.userSids;
    }
    public List<UserRecommendationResponse> getUsernames() {
        return this.usernames == null ? List.of() : this.usernames;
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

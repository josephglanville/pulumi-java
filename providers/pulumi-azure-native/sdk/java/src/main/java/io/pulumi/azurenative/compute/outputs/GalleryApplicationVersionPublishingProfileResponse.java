// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.TargetRegionResponse;
import io.pulumi.azurenative.compute.outputs.UserArtifactManageResponse;
import io.pulumi.azurenative.compute.outputs.UserArtifactSourceResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GalleryApplicationVersionPublishingProfileResponse {
    private final @Nullable Boolean enableHealthCheck;
    private final @Nullable String endOfLifeDate;
    private final @Nullable Boolean excludeFromLatest;
    private final @Nullable UserArtifactManageResponse manageActions;
    private final String publishedDate;
    private final @Nullable Integer replicaCount;
    private final UserArtifactSourceResponse source;
    private final @Nullable String storageAccountType;
    private final @Nullable List<TargetRegionResponse> targetRegions;

    @OutputCustomType.Constructor({"enableHealthCheck","endOfLifeDate","excludeFromLatest","manageActions","publishedDate","replicaCount","source","storageAccountType","targetRegions"})
    private GalleryApplicationVersionPublishingProfileResponse(
        @Nullable Boolean enableHealthCheck,
        @Nullable String endOfLifeDate,
        @Nullable Boolean excludeFromLatest,
        @Nullable UserArtifactManageResponse manageActions,
        String publishedDate,
        @Nullable Integer replicaCount,
        UserArtifactSourceResponse source,
        @Nullable String storageAccountType,
        @Nullable List<TargetRegionResponse> targetRegions) {
        this.enableHealthCheck = enableHealthCheck;
        this.endOfLifeDate = endOfLifeDate;
        this.excludeFromLatest = excludeFromLatest;
        this.manageActions = manageActions;
        this.publishedDate = Objects.requireNonNull(publishedDate);
        this.replicaCount = replicaCount;
        this.source = Objects.requireNonNull(source);
        this.storageAccountType = storageAccountType;
        this.targetRegions = targetRegions;
    }

    public Optional<Boolean> getEnableHealthCheck() {
        return Optional.ofNullable(this.enableHealthCheck);
    }
    public Optional<String> getEndOfLifeDate() {
        return Optional.ofNullable(this.endOfLifeDate);
    }
    public Optional<Boolean> getExcludeFromLatest() {
        return Optional.ofNullable(this.excludeFromLatest);
    }
    public Optional<UserArtifactManageResponse> getManageActions() {
        return Optional.ofNullable(this.manageActions);
    }
    public String getPublishedDate() {
        return this.publishedDate;
    }
    public Optional<Integer> getReplicaCount() {
        return Optional.ofNullable(this.replicaCount);
    }
    public UserArtifactSourceResponse getSource() {
        return this.source;
    }
    public Optional<String> getStorageAccountType() {
        return Optional.ofNullable(this.storageAccountType);
    }
    public List<TargetRegionResponse> getTargetRegions() {
        return this.targetRegions == null ? List.of() : this.targetRegions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GalleryApplicationVersionPublishingProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enableHealthCheck;
        private @Nullable String endOfLifeDate;
        private @Nullable Boolean excludeFromLatest;
        private @Nullable UserArtifactManageResponse manageActions;
        private String publishedDate;
        private @Nullable Integer replicaCount;
        private UserArtifactSourceResponse source;
        private @Nullable String storageAccountType;
        private @Nullable List<TargetRegionResponse> targetRegions;

        public Builder() {
    	      // Empty
        }

        public Builder(GalleryApplicationVersionPublishingProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableHealthCheck = defaults.enableHealthCheck;
    	      this.endOfLifeDate = defaults.endOfLifeDate;
    	      this.excludeFromLatest = defaults.excludeFromLatest;
    	      this.manageActions = defaults.manageActions;
    	      this.publishedDate = defaults.publishedDate;
    	      this.replicaCount = defaults.replicaCount;
    	      this.source = defaults.source;
    	      this.storageAccountType = defaults.storageAccountType;
    	      this.targetRegions = defaults.targetRegions;
        }

        public Builder setEnableHealthCheck(@Nullable Boolean enableHealthCheck) {
            this.enableHealthCheck = enableHealthCheck;
            return this;
        }

        public Builder setEndOfLifeDate(@Nullable String endOfLifeDate) {
            this.endOfLifeDate = endOfLifeDate;
            return this;
        }

        public Builder setExcludeFromLatest(@Nullable Boolean excludeFromLatest) {
            this.excludeFromLatest = excludeFromLatest;
            return this;
        }

        public Builder setManageActions(@Nullable UserArtifactManageResponse manageActions) {
            this.manageActions = manageActions;
            return this;
        }

        public Builder setPublishedDate(String publishedDate) {
            this.publishedDate = Objects.requireNonNull(publishedDate);
            return this;
        }

        public Builder setReplicaCount(@Nullable Integer replicaCount) {
            this.replicaCount = replicaCount;
            return this;
        }

        public Builder setSource(UserArtifactSourceResponse source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }

        public Builder setStorageAccountType(@Nullable String storageAccountType) {
            this.storageAccountType = storageAccountType;
            return this;
        }

        public Builder setTargetRegions(@Nullable List<TargetRegionResponse> targetRegions) {
            this.targetRegions = targetRegions;
            return this;
        }

        public GalleryApplicationVersionPublishingProfileResponse build() {
            return new GalleryApplicationVersionPublishingProfileResponse(enableHealthCheck, endOfLifeDate, excludeFromLatest, manageActions, publishedDate, replicaCount, source, storageAccountType, targetRegions);
        }
    }
}

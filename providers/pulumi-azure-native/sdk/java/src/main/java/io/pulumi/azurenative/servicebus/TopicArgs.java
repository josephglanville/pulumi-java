// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicebus;

import io.pulumi.azurenative.servicebus.enums.EntityStatus;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TopicArgs extends io.pulumi.resources.ResourceArgs {

    public static final TopicArgs Empty = new TopicArgs();

    @InputImport(name="autoDeleteOnIdle")
    private final @Nullable Input<String> autoDeleteOnIdle;

    public Input<String> getAutoDeleteOnIdle() {
        return this.autoDeleteOnIdle == null ? Input.empty() : this.autoDeleteOnIdle;
    }

    @InputImport(name="defaultMessageTimeToLive")
    private final @Nullable Input<String> defaultMessageTimeToLive;

    public Input<String> getDefaultMessageTimeToLive() {
        return this.defaultMessageTimeToLive == null ? Input.empty() : this.defaultMessageTimeToLive;
    }

    @InputImport(name="duplicateDetectionHistoryTimeWindow")
    private final @Nullable Input<String> duplicateDetectionHistoryTimeWindow;

    public Input<String> getDuplicateDetectionHistoryTimeWindow() {
        return this.duplicateDetectionHistoryTimeWindow == null ? Input.empty() : this.duplicateDetectionHistoryTimeWindow;
    }

    @InputImport(name="enableBatchedOperations")
    private final @Nullable Input<Boolean> enableBatchedOperations;

    public Input<Boolean> getEnableBatchedOperations() {
        return this.enableBatchedOperations == null ? Input.empty() : this.enableBatchedOperations;
    }

    @InputImport(name="enableExpress")
    private final @Nullable Input<Boolean> enableExpress;

    public Input<Boolean> getEnableExpress() {
        return this.enableExpress == null ? Input.empty() : this.enableExpress;
    }

    @InputImport(name="enablePartitioning")
    private final @Nullable Input<Boolean> enablePartitioning;

    public Input<Boolean> getEnablePartitioning() {
        return this.enablePartitioning == null ? Input.empty() : this.enablePartitioning;
    }

    @InputImport(name="maxSizeInMegabytes")
    private final @Nullable Input<Integer> maxSizeInMegabytes;

    public Input<Integer> getMaxSizeInMegabytes() {
        return this.maxSizeInMegabytes == null ? Input.empty() : this.maxSizeInMegabytes;
    }

    @InputImport(name="namespaceName", required=true)
    private final Input<String> namespaceName;

    public Input<String> getNamespaceName() {
        return this.namespaceName;
    }

    @InputImport(name="requiresDuplicateDetection")
    private final @Nullable Input<Boolean> requiresDuplicateDetection;

    public Input<Boolean> getRequiresDuplicateDetection() {
        return this.requiresDuplicateDetection == null ? Input.empty() : this.requiresDuplicateDetection;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="status")
    private final @Nullable Input<EntityStatus> status;

    public Input<EntityStatus> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    @InputImport(name="supportOrdering")
    private final @Nullable Input<Boolean> supportOrdering;

    public Input<Boolean> getSupportOrdering() {
        return this.supportOrdering == null ? Input.empty() : this.supportOrdering;
    }

    @InputImport(name="topicName")
    private final @Nullable Input<String> topicName;

    public Input<String> getTopicName() {
        return this.topicName == null ? Input.empty() : this.topicName;
    }

    public TopicArgs(
        @Nullable Input<String> autoDeleteOnIdle,
        @Nullable Input<String> defaultMessageTimeToLive,
        @Nullable Input<String> duplicateDetectionHistoryTimeWindow,
        @Nullable Input<Boolean> enableBatchedOperations,
        @Nullable Input<Boolean> enableExpress,
        @Nullable Input<Boolean> enablePartitioning,
        @Nullable Input<Integer> maxSizeInMegabytes,
        Input<String> namespaceName,
        @Nullable Input<Boolean> requiresDuplicateDetection,
        Input<String> resourceGroupName,
        @Nullable Input<EntityStatus> status,
        @Nullable Input<Boolean> supportOrdering,
        @Nullable Input<String> topicName) {
        this.autoDeleteOnIdle = autoDeleteOnIdle;
        this.defaultMessageTimeToLive = defaultMessageTimeToLive;
        this.duplicateDetectionHistoryTimeWindow = duplicateDetectionHistoryTimeWindow;
        this.enableBatchedOperations = enableBatchedOperations;
        this.enableExpress = enableExpress;
        this.enablePartitioning = enablePartitioning;
        this.maxSizeInMegabytes = maxSizeInMegabytes;
        this.namespaceName = Objects.requireNonNull(namespaceName, "expected parameter 'namespaceName' to be non-null");
        this.requiresDuplicateDetection = requiresDuplicateDetection;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.status = status;
        this.supportOrdering = supportOrdering;
        this.topicName = topicName;
    }

    private TopicArgs() {
        this.autoDeleteOnIdle = Input.empty();
        this.defaultMessageTimeToLive = Input.empty();
        this.duplicateDetectionHistoryTimeWindow = Input.empty();
        this.enableBatchedOperations = Input.empty();
        this.enableExpress = Input.empty();
        this.enablePartitioning = Input.empty();
        this.maxSizeInMegabytes = Input.empty();
        this.namespaceName = Input.empty();
        this.requiresDuplicateDetection = Input.empty();
        this.resourceGroupName = Input.empty();
        this.status = Input.empty();
        this.supportOrdering = Input.empty();
        this.topicName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> autoDeleteOnIdle;
        private @Nullable Input<String> defaultMessageTimeToLive;
        private @Nullable Input<String> duplicateDetectionHistoryTimeWindow;
        private @Nullable Input<Boolean> enableBatchedOperations;
        private @Nullable Input<Boolean> enableExpress;
        private @Nullable Input<Boolean> enablePartitioning;
        private @Nullable Input<Integer> maxSizeInMegabytes;
        private Input<String> namespaceName;
        private @Nullable Input<Boolean> requiresDuplicateDetection;
        private Input<String> resourceGroupName;
        private @Nullable Input<EntityStatus> status;
        private @Nullable Input<Boolean> supportOrdering;
        private @Nullable Input<String> topicName;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoDeleteOnIdle = defaults.autoDeleteOnIdle;
    	      this.defaultMessageTimeToLive = defaults.defaultMessageTimeToLive;
    	      this.duplicateDetectionHistoryTimeWindow = defaults.duplicateDetectionHistoryTimeWindow;
    	      this.enableBatchedOperations = defaults.enableBatchedOperations;
    	      this.enableExpress = defaults.enableExpress;
    	      this.enablePartitioning = defaults.enablePartitioning;
    	      this.maxSizeInMegabytes = defaults.maxSizeInMegabytes;
    	      this.namespaceName = defaults.namespaceName;
    	      this.requiresDuplicateDetection = defaults.requiresDuplicateDetection;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.status = defaults.status;
    	      this.supportOrdering = defaults.supportOrdering;
    	      this.topicName = defaults.topicName;
        }

        public Builder setAutoDeleteOnIdle(@Nullable Input<String> autoDeleteOnIdle) {
            this.autoDeleteOnIdle = autoDeleteOnIdle;
            return this;
        }

        public Builder setAutoDeleteOnIdle(@Nullable String autoDeleteOnIdle) {
            this.autoDeleteOnIdle = Input.ofNullable(autoDeleteOnIdle);
            return this;
        }

        public Builder setDefaultMessageTimeToLive(@Nullable Input<String> defaultMessageTimeToLive) {
            this.defaultMessageTimeToLive = defaultMessageTimeToLive;
            return this;
        }

        public Builder setDefaultMessageTimeToLive(@Nullable String defaultMessageTimeToLive) {
            this.defaultMessageTimeToLive = Input.ofNullable(defaultMessageTimeToLive);
            return this;
        }

        public Builder setDuplicateDetectionHistoryTimeWindow(@Nullable Input<String> duplicateDetectionHistoryTimeWindow) {
            this.duplicateDetectionHistoryTimeWindow = duplicateDetectionHistoryTimeWindow;
            return this;
        }

        public Builder setDuplicateDetectionHistoryTimeWindow(@Nullable String duplicateDetectionHistoryTimeWindow) {
            this.duplicateDetectionHistoryTimeWindow = Input.ofNullable(duplicateDetectionHistoryTimeWindow);
            return this;
        }

        public Builder setEnableBatchedOperations(@Nullable Input<Boolean> enableBatchedOperations) {
            this.enableBatchedOperations = enableBatchedOperations;
            return this;
        }

        public Builder setEnableBatchedOperations(@Nullable Boolean enableBatchedOperations) {
            this.enableBatchedOperations = Input.ofNullable(enableBatchedOperations);
            return this;
        }

        public Builder setEnableExpress(@Nullable Input<Boolean> enableExpress) {
            this.enableExpress = enableExpress;
            return this;
        }

        public Builder setEnableExpress(@Nullable Boolean enableExpress) {
            this.enableExpress = Input.ofNullable(enableExpress);
            return this;
        }

        public Builder setEnablePartitioning(@Nullable Input<Boolean> enablePartitioning) {
            this.enablePartitioning = enablePartitioning;
            return this;
        }

        public Builder setEnablePartitioning(@Nullable Boolean enablePartitioning) {
            this.enablePartitioning = Input.ofNullable(enablePartitioning);
            return this;
        }

        public Builder setMaxSizeInMegabytes(@Nullable Input<Integer> maxSizeInMegabytes) {
            this.maxSizeInMegabytes = maxSizeInMegabytes;
            return this;
        }

        public Builder setMaxSizeInMegabytes(@Nullable Integer maxSizeInMegabytes) {
            this.maxSizeInMegabytes = Input.ofNullable(maxSizeInMegabytes);
            return this;
        }

        public Builder setNamespaceName(Input<String> namespaceName) {
            this.namespaceName = Objects.requireNonNull(namespaceName);
            return this;
        }

        public Builder setNamespaceName(String namespaceName) {
            this.namespaceName = Input.of(Objects.requireNonNull(namespaceName));
            return this;
        }

        public Builder setRequiresDuplicateDetection(@Nullable Input<Boolean> requiresDuplicateDetection) {
            this.requiresDuplicateDetection = requiresDuplicateDetection;
            return this;
        }

        public Builder setRequiresDuplicateDetection(@Nullable Boolean requiresDuplicateDetection) {
            this.requiresDuplicateDetection = Input.ofNullable(requiresDuplicateDetection);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setStatus(@Nullable Input<EntityStatus> status) {
            this.status = status;
            return this;
        }

        public Builder setStatus(@Nullable EntityStatus status) {
            this.status = Input.ofNullable(status);
            return this;
        }

        public Builder setSupportOrdering(@Nullable Input<Boolean> supportOrdering) {
            this.supportOrdering = supportOrdering;
            return this;
        }

        public Builder setSupportOrdering(@Nullable Boolean supportOrdering) {
            this.supportOrdering = Input.ofNullable(supportOrdering);
            return this;
        }

        public Builder setTopicName(@Nullable Input<String> topicName) {
            this.topicName = topicName;
            return this;
        }

        public Builder setTopicName(@Nullable String topicName) {
            this.topicName = Input.ofNullable(topicName);
            return this;
        }

        public TopicArgs build() {
            return new TopicArgs(autoDeleteOnIdle, defaultMessageTimeToLive, duplicateDetectionHistoryTimeWindow, enableBatchedOperations, enableExpress, enablePartitioning, maxSizeInMegabytes, namespaceName, requiresDuplicateDetection, resourceGroupName, status, supportOrdering, topicName);
        }
    }
}
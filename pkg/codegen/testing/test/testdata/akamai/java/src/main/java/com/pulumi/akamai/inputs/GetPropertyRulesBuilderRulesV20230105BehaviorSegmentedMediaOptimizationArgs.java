// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230105BehaviorSegmentedMediaOptimizationArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20230105BehaviorSegmentedMediaOptimizationArgs Empty = new GetPropertyRulesBuilderRulesV20230105BehaviorSegmentedMediaOptimizationArgs();

    @Import(name="behavior")
    private @Nullable Output<String> behavior;

    public Optional<Output<String>> behavior() {
        return Optional.ofNullable(this.behavior);
    }

    @Import(name="dvrType")
    private @Nullable Output<String> dvrType;

    public Optional<Output<String>> dvrType() {
        return Optional.ofNullable(this.dvrType);
    }

    @Import(name="dvrWindow")
    private @Nullable Output<String> dvrWindow;

    public Optional<Output<String>> dvrWindow() {
        return Optional.ofNullable(this.dvrWindow);
    }

    @Import(name="enableUllStreaming")
    private @Nullable Output<Boolean> enableUllStreaming;

    public Optional<Output<Boolean>> enableUllStreaming() {
        return Optional.ofNullable(this.enableUllStreaming);
    }

    @Import(name="endTime")
    private @Nullable Output<String> endTime;

    public Optional<Output<String>> endTime() {
        return Optional.ofNullable(this.endTime);
    }

    @Import(name="liveType")
    private @Nullable Output<String> liveType;

    public Optional<Output<String>> liveType() {
        return Optional.ofNullable(this.liveType);
    }

    @Import(name="locked")
    private @Nullable Output<Boolean> locked;

    public Optional<Output<Boolean>> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="showAdvanced")
    private @Nullable Output<Boolean> showAdvanced;

    public Optional<Output<Boolean>> showAdvanced() {
        return Optional.ofNullable(this.showAdvanced);
    }

    @Import(name="startTime")
    private @Nullable Output<String> startTime;

    public Optional<Output<String>> startTime() {
        return Optional.ofNullable(this.startTime);
    }

    @Import(name="templateUuid")
    private @Nullable Output<String> templateUuid;

    public Optional<Output<String>> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }

    @Import(name="uuid")
    private @Nullable Output<String> uuid;

    public Optional<Output<String>> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    private GetPropertyRulesBuilderRulesV20230105BehaviorSegmentedMediaOptimizationArgs() {}

    private GetPropertyRulesBuilderRulesV20230105BehaviorSegmentedMediaOptimizationArgs(GetPropertyRulesBuilderRulesV20230105BehaviorSegmentedMediaOptimizationArgs $) {
        this.behavior = $.behavior;
        this.dvrType = $.dvrType;
        this.dvrWindow = $.dvrWindow;
        this.enableUllStreaming = $.enableUllStreaming;
        this.endTime = $.endTime;
        this.liveType = $.liveType;
        this.locked = $.locked;
        this.showAdvanced = $.showAdvanced;
        this.startTime = $.startTime;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorSegmentedMediaOptimizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230105BehaviorSegmentedMediaOptimizationArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorSegmentedMediaOptimizationArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorSegmentedMediaOptimizationArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorSegmentedMediaOptimizationArgs(Objects.requireNonNull(defaults));
        }

        public Builder behavior(@Nullable Output<String> behavior) {
            $.behavior = behavior;
            return this;
        }

        public Builder behavior(String behavior) {
            return behavior(Output.of(behavior));
        }

        public Builder dvrType(@Nullable Output<String> dvrType) {
            $.dvrType = dvrType;
            return this;
        }

        public Builder dvrType(String dvrType) {
            return dvrType(Output.of(dvrType));
        }

        public Builder dvrWindow(@Nullable Output<String> dvrWindow) {
            $.dvrWindow = dvrWindow;
            return this;
        }

        public Builder dvrWindow(String dvrWindow) {
            return dvrWindow(Output.of(dvrWindow));
        }

        public Builder enableUllStreaming(@Nullable Output<Boolean> enableUllStreaming) {
            $.enableUllStreaming = enableUllStreaming;
            return this;
        }

        public Builder enableUllStreaming(Boolean enableUllStreaming) {
            return enableUllStreaming(Output.of(enableUllStreaming));
        }

        public Builder endTime(@Nullable Output<String> endTime) {
            $.endTime = endTime;
            return this;
        }

        public Builder endTime(String endTime) {
            return endTime(Output.of(endTime));
        }

        public Builder liveType(@Nullable Output<String> liveType) {
            $.liveType = liveType;
            return this;
        }

        public Builder liveType(String liveType) {
            return liveType(Output.of(liveType));
        }

        public Builder locked(@Nullable Output<Boolean> locked) {
            $.locked = locked;
            return this;
        }

        public Builder locked(Boolean locked) {
            return locked(Output.of(locked));
        }

        public Builder showAdvanced(@Nullable Output<Boolean> showAdvanced) {
            $.showAdvanced = showAdvanced;
            return this;
        }

        public Builder showAdvanced(Boolean showAdvanced) {
            return showAdvanced(Output.of(showAdvanced));
        }

        public Builder startTime(@Nullable Output<String> startTime) {
            $.startTime = startTime;
            return this;
        }

        public Builder startTime(String startTime) {
            return startTime(Output.of(startTime));
        }

        public Builder templateUuid(@Nullable Output<String> templateUuid) {
            $.templateUuid = templateUuid;
            return this;
        }

        public Builder templateUuid(String templateUuid) {
            return templateUuid(Output.of(templateUuid));
        }

        public Builder uuid(@Nullable Output<String> uuid) {
            $.uuid = uuid;
            return this;
        }

        public Builder uuid(String uuid) {
            return uuid(Output.of(uuid));
        }

        public GetPropertyRulesBuilderRulesV20230105BehaviorSegmentedMediaOptimizationArgs build() {
            return $;
        }
    }

}

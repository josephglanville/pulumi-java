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


public final class GetPropertyRulesBuilderRulesV20230530BehaviorLargeFileOptimizationArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20230530BehaviorLargeFileOptimizationArgs Empty = new GetPropertyRulesBuilderRulesV20230530BehaviorLargeFileOptimizationArgs();

    @Import(name="enablePartialObjectCaching")
    private @Nullable Output<String> enablePartialObjectCaching;

    public Optional<Output<String>> enablePartialObjectCaching() {
        return Optional.ofNullable(this.enablePartialObjectCaching);
    }

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="locked")
    private @Nullable Output<Boolean> locked;

    public Optional<Output<Boolean>> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="maximumSize")
    private @Nullable Output<String> maximumSize;

    public Optional<Output<String>> maximumSize() {
        return Optional.ofNullable(this.maximumSize);
    }

    @Import(name="minimumSize")
    private @Nullable Output<String> minimumSize;

    public Optional<Output<String>> minimumSize() {
        return Optional.ofNullable(this.minimumSize);
    }

    @Import(name="templateUuid")
    private @Nullable Output<String> templateUuid;

    public Optional<Output<String>> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }

    @Import(name="useVersioning")
    private @Nullable Output<Boolean> useVersioning;

    public Optional<Output<Boolean>> useVersioning() {
        return Optional.ofNullable(this.useVersioning);
    }

    @Import(name="uuid")
    private @Nullable Output<String> uuid;

    public Optional<Output<String>> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    private GetPropertyRulesBuilderRulesV20230530BehaviorLargeFileOptimizationArgs() {}

    private GetPropertyRulesBuilderRulesV20230530BehaviorLargeFileOptimizationArgs(GetPropertyRulesBuilderRulesV20230530BehaviorLargeFileOptimizationArgs $) {
        this.enablePartialObjectCaching = $.enablePartialObjectCaching;
        this.enabled = $.enabled;
        this.locked = $.locked;
        this.maximumSize = $.maximumSize;
        this.minimumSize = $.minimumSize;
        this.templateUuid = $.templateUuid;
        this.useVersioning = $.useVersioning;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorLargeFileOptimizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230530BehaviorLargeFileOptimizationArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorLargeFileOptimizationArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorLargeFileOptimizationArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorLargeFileOptimizationArgs(Objects.requireNonNull(defaults));
        }

        public Builder enablePartialObjectCaching(@Nullable Output<String> enablePartialObjectCaching) {
            $.enablePartialObjectCaching = enablePartialObjectCaching;
            return this;
        }

        public Builder enablePartialObjectCaching(String enablePartialObjectCaching) {
            return enablePartialObjectCaching(Output.of(enablePartialObjectCaching));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder locked(@Nullable Output<Boolean> locked) {
            $.locked = locked;
            return this;
        }

        public Builder locked(Boolean locked) {
            return locked(Output.of(locked));
        }

        public Builder maximumSize(@Nullable Output<String> maximumSize) {
            $.maximumSize = maximumSize;
            return this;
        }

        public Builder maximumSize(String maximumSize) {
            return maximumSize(Output.of(maximumSize));
        }

        public Builder minimumSize(@Nullable Output<String> minimumSize) {
            $.minimumSize = minimumSize;
            return this;
        }

        public Builder minimumSize(String minimumSize) {
            return minimumSize(Output.of(minimumSize));
        }

        public Builder templateUuid(@Nullable Output<String> templateUuid) {
            $.templateUuid = templateUuid;
            return this;
        }

        public Builder templateUuid(String templateUuid) {
            return templateUuid(Output.of(templateUuid));
        }

        public Builder useVersioning(@Nullable Output<Boolean> useVersioning) {
            $.useVersioning = useVersioning;
            return this;
        }

        public Builder useVersioning(Boolean useVersioning) {
            return useVersioning(Output.of(useVersioning));
        }

        public Builder uuid(@Nullable Output<String> uuid) {
            $.uuid = uuid;
            return this;
        }

        public Builder uuid(String uuid) {
            return uuid(Output.of(uuid));
        }

        public GetPropertyRulesBuilderRulesV20230530BehaviorLargeFileOptimizationArgs build() {
            return $;
        }
    }

}

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


public final class GetPropertyRulesBuilderRulesV20230105BehaviorDownloadCompleteMarkerArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20230105BehaviorDownloadCompleteMarkerArgs Empty = new GetPropertyRulesBuilderRulesV20230105BehaviorDownloadCompleteMarkerArgs();

    @Import(name="enabled")
    private @Nullable Output<String> enabled;

    public Optional<Output<String>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="locked")
    private @Nullable Output<Boolean> locked;

    public Optional<Output<Boolean>> locked() {
        return Optional.ofNullable(this.locked);
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

    private GetPropertyRulesBuilderRulesV20230105BehaviorDownloadCompleteMarkerArgs() {}

    private GetPropertyRulesBuilderRulesV20230105BehaviorDownloadCompleteMarkerArgs(GetPropertyRulesBuilderRulesV20230105BehaviorDownloadCompleteMarkerArgs $) {
        this.enabled = $.enabled;
        this.locked = $.locked;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorDownloadCompleteMarkerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230105BehaviorDownloadCompleteMarkerArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorDownloadCompleteMarkerArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorDownloadCompleteMarkerArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorDownloadCompleteMarkerArgs(Objects.requireNonNull(defaults));
        }

        public Builder enabled(@Nullable Output<String> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(String enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder locked(@Nullable Output<Boolean> locked) {
            $.locked = locked;
            return this;
        }

        public Builder locked(Boolean locked) {
            return locked(Output.of(locked));
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

        public GetPropertyRulesBuilderRulesV20230105BehaviorDownloadCompleteMarkerArgs build() {
            return $;
        }
    }

}

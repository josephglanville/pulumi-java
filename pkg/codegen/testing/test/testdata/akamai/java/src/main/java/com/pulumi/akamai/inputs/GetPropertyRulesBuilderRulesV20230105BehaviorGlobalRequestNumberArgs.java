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


public final class GetPropertyRulesBuilderRulesV20230105BehaviorGlobalRequestNumberArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20230105BehaviorGlobalRequestNumberArgs Empty = new GetPropertyRulesBuilderRulesV20230105BehaviorGlobalRequestNumberArgs();

    @Import(name="headerName")
    private @Nullable Output<String> headerName;

    public Optional<Output<String>> headerName() {
        return Optional.ofNullable(this.headerName);
    }

    @Import(name="locked")
    private @Nullable Output<Boolean> locked;

    public Optional<Output<Boolean>> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="outputOption")
    private @Nullable Output<String> outputOption;

    public Optional<Output<String>> outputOption() {
        return Optional.ofNullable(this.outputOption);
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

    @Import(name="variableName")
    private @Nullable Output<String> variableName;

    public Optional<Output<String>> variableName() {
        return Optional.ofNullable(this.variableName);
    }

    private GetPropertyRulesBuilderRulesV20230105BehaviorGlobalRequestNumberArgs() {}

    private GetPropertyRulesBuilderRulesV20230105BehaviorGlobalRequestNumberArgs(GetPropertyRulesBuilderRulesV20230105BehaviorGlobalRequestNumberArgs $) {
        this.headerName = $.headerName;
        this.locked = $.locked;
        this.outputOption = $.outputOption;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
        this.variableName = $.variableName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorGlobalRequestNumberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230105BehaviorGlobalRequestNumberArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorGlobalRequestNumberArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorGlobalRequestNumberArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorGlobalRequestNumberArgs(Objects.requireNonNull(defaults));
        }

        public Builder headerName(@Nullable Output<String> headerName) {
            $.headerName = headerName;
            return this;
        }

        public Builder headerName(String headerName) {
            return headerName(Output.of(headerName));
        }

        public Builder locked(@Nullable Output<Boolean> locked) {
            $.locked = locked;
            return this;
        }

        public Builder locked(Boolean locked) {
            return locked(Output.of(locked));
        }

        public Builder outputOption(@Nullable Output<String> outputOption) {
            $.outputOption = outputOption;
            return this;
        }

        public Builder outputOption(String outputOption) {
            return outputOption(Output.of(outputOption));
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

        public Builder variableName(@Nullable Output<String> variableName) {
            $.variableName = variableName;
            return this;
        }

        public Builder variableName(String variableName) {
            return variableName(Output.of(variableName));
        }

        public GetPropertyRulesBuilderRulesV20230105BehaviorGlobalRequestNumberArgs build() {
            return $;
        }
    }

}

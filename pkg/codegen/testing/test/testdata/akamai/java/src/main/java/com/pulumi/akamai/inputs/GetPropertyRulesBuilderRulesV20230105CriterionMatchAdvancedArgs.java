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


public final class GetPropertyRulesBuilderRulesV20230105CriterionMatchAdvancedArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20230105CriterionMatchAdvancedArgs Empty = new GetPropertyRulesBuilderRulesV20230105CriterionMatchAdvancedArgs();

    @Import(name="closeXml")
    private @Nullable Output<String> closeXml;

    public Optional<Output<String>> closeXml() {
        return Optional.ofNullable(this.closeXml);
    }

    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="locked")
    private @Nullable Output<Boolean> locked;

    public Optional<Output<Boolean>> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="openXml")
    private @Nullable Output<String> openXml;

    public Optional<Output<String>> openXml() {
        return Optional.ofNullable(this.openXml);
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

    private GetPropertyRulesBuilderRulesV20230105CriterionMatchAdvancedArgs() {}

    private GetPropertyRulesBuilderRulesV20230105CriterionMatchAdvancedArgs(GetPropertyRulesBuilderRulesV20230105CriterionMatchAdvancedArgs $) {
        this.closeXml = $.closeXml;
        this.description = $.description;
        this.locked = $.locked;
        this.openXml = $.openXml;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230105CriterionMatchAdvancedArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230105CriterionMatchAdvancedArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230105CriterionMatchAdvancedArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230105CriterionMatchAdvancedArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230105CriterionMatchAdvancedArgs(Objects.requireNonNull(defaults));
        }

        public Builder closeXml(@Nullable Output<String> closeXml) {
            $.closeXml = closeXml;
            return this;
        }

        public Builder closeXml(String closeXml) {
            return closeXml(Output.of(closeXml));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder locked(@Nullable Output<Boolean> locked) {
            $.locked = locked;
            return this;
        }

        public Builder locked(Boolean locked) {
            return locked(Output.of(locked));
        }

        public Builder openXml(@Nullable Output<String> openXml) {
            $.openXml = openXml;
            return this;
        }

        public Builder openXml(String openXml) {
            return openXml(Output.of(openXml));
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

        public GetPropertyRulesBuilderRulesV20230105CriterionMatchAdvancedArgs build() {
            return $;
        }
    }

}

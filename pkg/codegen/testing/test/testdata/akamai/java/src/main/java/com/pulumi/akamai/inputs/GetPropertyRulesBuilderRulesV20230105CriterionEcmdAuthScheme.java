// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230105CriterionEcmdAuthScheme extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230105CriterionEcmdAuthScheme Empty = new GetPropertyRulesBuilderRulesV20230105CriterionEcmdAuthScheme();

    @Import(name="authScheme")
    private @Nullable String authScheme;

    public Optional<String> authScheme() {
        return Optional.ofNullable(this.authScheme);
    }

    @Import(name="locked")
    private @Nullable Boolean locked;

    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="templateUuid")
    private @Nullable String templateUuid;

    public Optional<String> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }

    @Import(name="uuid")
    private @Nullable String uuid;

    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    private GetPropertyRulesBuilderRulesV20230105CriterionEcmdAuthScheme() {}

    private GetPropertyRulesBuilderRulesV20230105CriterionEcmdAuthScheme(GetPropertyRulesBuilderRulesV20230105CriterionEcmdAuthScheme $) {
        this.authScheme = $.authScheme;
        this.locked = $.locked;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230105CriterionEcmdAuthScheme defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230105CriterionEcmdAuthScheme $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230105CriterionEcmdAuthScheme();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230105CriterionEcmdAuthScheme defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230105CriterionEcmdAuthScheme(Objects.requireNonNull(defaults));
        }

        public Builder authScheme(@Nullable String authScheme) {
            $.authScheme = authScheme;
            return this;
        }

        public Builder locked(@Nullable Boolean locked) {
            $.locked = locked;
            return this;
        }

        public Builder templateUuid(@Nullable String templateUuid) {
            $.templateUuid = templateUuid;
            return this;
        }

        public Builder uuid(@Nullable String uuid) {
            $.uuid = uuid;
            return this;
        }

        public GetPropertyRulesBuilderRulesV20230105CriterionEcmdAuthScheme build() {
            return $;
        }
    }

}

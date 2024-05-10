// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230105BehaviorAkamaizerTag extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230105BehaviorAkamaizerTag Empty = new GetPropertyRulesBuilderRulesV20230105BehaviorAkamaizerTag();

    @Import(name="includeTagsAttribute")
    private @Nullable Boolean includeTagsAttribute;

    public Optional<Boolean> includeTagsAttribute() {
        return Optional.ofNullable(this.includeTagsAttribute);
    }

    @Import(name="locked")
    private @Nullable Boolean locked;

    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="matchHostname")
    private @Nullable String matchHostname;

    public Optional<String> matchHostname() {
        return Optional.ofNullable(this.matchHostname);
    }

    @Import(name="replaceAll")
    private @Nullable Boolean replaceAll;

    public Optional<Boolean> replaceAll() {
        return Optional.ofNullable(this.replaceAll);
    }

    @Import(name="replacementHostname")
    private @Nullable String replacementHostname;

    public Optional<String> replacementHostname() {
        return Optional.ofNullable(this.replacementHostname);
    }

    @Import(name="scope")
    private @Nullable String scope;

    public Optional<String> scope() {
        return Optional.ofNullable(this.scope);
    }

    @Import(name="tagsAttribute")
    private @Nullable String tagsAttribute;

    public Optional<String> tagsAttribute() {
        return Optional.ofNullable(this.tagsAttribute);
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

    private GetPropertyRulesBuilderRulesV20230105BehaviorAkamaizerTag() {}

    private GetPropertyRulesBuilderRulesV20230105BehaviorAkamaizerTag(GetPropertyRulesBuilderRulesV20230105BehaviorAkamaizerTag $) {
        this.includeTagsAttribute = $.includeTagsAttribute;
        this.locked = $.locked;
        this.matchHostname = $.matchHostname;
        this.replaceAll = $.replaceAll;
        this.replacementHostname = $.replacementHostname;
        this.scope = $.scope;
        this.tagsAttribute = $.tagsAttribute;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorAkamaizerTag defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230105BehaviorAkamaizerTag $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorAkamaizerTag();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorAkamaizerTag defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorAkamaizerTag(Objects.requireNonNull(defaults));
        }

        public Builder includeTagsAttribute(@Nullable Boolean includeTagsAttribute) {
            $.includeTagsAttribute = includeTagsAttribute;
            return this;
        }

        public Builder locked(@Nullable Boolean locked) {
            $.locked = locked;
            return this;
        }

        public Builder matchHostname(@Nullable String matchHostname) {
            $.matchHostname = matchHostname;
            return this;
        }

        public Builder replaceAll(@Nullable Boolean replaceAll) {
            $.replaceAll = replaceAll;
            return this;
        }

        public Builder replacementHostname(@Nullable String replacementHostname) {
            $.replacementHostname = replacementHostname;
            return this;
        }

        public Builder scope(@Nullable String scope) {
            $.scope = scope;
            return this;
        }

        public Builder tagsAttribute(@Nullable String tagsAttribute) {
            $.tagsAttribute = tagsAttribute;
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

        public GetPropertyRulesBuilderRulesV20230105BehaviorAkamaizerTag build() {
            return $;
        }
    }

}

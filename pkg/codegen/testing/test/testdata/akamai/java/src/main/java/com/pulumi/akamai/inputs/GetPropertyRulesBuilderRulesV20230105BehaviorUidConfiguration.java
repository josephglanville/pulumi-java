// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230105BehaviorUidConfiguration extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230105BehaviorUidConfiguration Empty = new GetPropertyRulesBuilderRulesV20230105BehaviorUidConfiguration();

    @Import(name="enabled")
    private @Nullable Boolean enabled;

    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="extractLocation")
    private @Nullable String extractLocation;

    public Optional<String> extractLocation() {
        return Optional.ofNullable(this.extractLocation);
    }

    @Import(name="headerName")
    private @Nullable String headerName;

    public Optional<String> headerName() {
        return Optional.ofNullable(this.headerName);
    }

    @Import(name="legalText")
    private @Nullable String legalText;

    public Optional<String> legalText() {
        return Optional.ofNullable(this.legalText);
    }

    @Import(name="locked")
    private @Nullable Boolean locked;

    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="queryParameterName")
    private @Nullable String queryParameterName;

    public Optional<String> queryParameterName() {
        return Optional.ofNullable(this.queryParameterName);
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

    @Import(name="variableName")
    private @Nullable String variableName;

    public Optional<String> variableName() {
        return Optional.ofNullable(this.variableName);
    }

    private GetPropertyRulesBuilderRulesV20230105BehaviorUidConfiguration() {}

    private GetPropertyRulesBuilderRulesV20230105BehaviorUidConfiguration(GetPropertyRulesBuilderRulesV20230105BehaviorUidConfiguration $) {
        this.enabled = $.enabled;
        this.extractLocation = $.extractLocation;
        this.headerName = $.headerName;
        this.legalText = $.legalText;
        this.locked = $.locked;
        this.queryParameterName = $.queryParameterName;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
        this.variableName = $.variableName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorUidConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230105BehaviorUidConfiguration $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorUidConfiguration();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorUidConfiguration defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorUidConfiguration(Objects.requireNonNull(defaults));
        }

        public Builder enabled(@Nullable Boolean enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder extractLocation(@Nullable String extractLocation) {
            $.extractLocation = extractLocation;
            return this;
        }

        public Builder headerName(@Nullable String headerName) {
            $.headerName = headerName;
            return this;
        }

        public Builder legalText(@Nullable String legalText) {
            $.legalText = legalText;
            return this;
        }

        public Builder locked(@Nullable Boolean locked) {
            $.locked = locked;
            return this;
        }

        public Builder queryParameterName(@Nullable String queryParameterName) {
            $.queryParameterName = queryParameterName;
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

        public Builder variableName(@Nullable String variableName) {
            $.variableName = variableName;
            return this;
        }

        public GetPropertyRulesBuilderRulesV20230105BehaviorUidConfiguration build() {
            return $;
        }
    }

}

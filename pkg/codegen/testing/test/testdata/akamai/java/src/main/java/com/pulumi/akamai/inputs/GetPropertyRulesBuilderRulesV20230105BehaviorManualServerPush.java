// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230105BehaviorManualServerPush extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230105BehaviorManualServerPush Empty = new GetPropertyRulesBuilderRulesV20230105BehaviorManualServerPush();

    @Import(name="locked")
    private @Nullable Boolean locked;

    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="serverpushlists")
    private @Nullable List<String> serverpushlists;

    public Optional<List<String>> serverpushlists() {
        return Optional.ofNullable(this.serverpushlists);
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

    private GetPropertyRulesBuilderRulesV20230105BehaviorManualServerPush() {}

    private GetPropertyRulesBuilderRulesV20230105BehaviorManualServerPush(GetPropertyRulesBuilderRulesV20230105BehaviorManualServerPush $) {
        this.locked = $.locked;
        this.serverpushlists = $.serverpushlists;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorManualServerPush defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230105BehaviorManualServerPush $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorManualServerPush();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorManualServerPush defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorManualServerPush(Objects.requireNonNull(defaults));
        }

        public Builder locked(@Nullable Boolean locked) {
            $.locked = locked;
            return this;
        }

        public Builder serverpushlists(@Nullable List<String> serverpushlists) {
            $.serverpushlists = serverpushlists;
            return this;
        }

        public Builder serverpushlists(String... serverpushlists) {
            return serverpushlists(List.of(serverpushlists));
        }

        public Builder templateUuid(@Nullable String templateUuid) {
            $.templateUuid = templateUuid;
            return this;
        }

        public Builder uuid(@Nullable String uuid) {
            $.uuid = uuid;
            return this;
        }

        public GetPropertyRulesBuilderRulesV20230105BehaviorManualServerPush build() {
            return $;
        }
    }

}

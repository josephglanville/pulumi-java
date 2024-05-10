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


public final class GetPropertyRulesBuilderRulesV20230530CriterionServerLocation extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230530CriterionServerLocation Empty = new GetPropertyRulesBuilderRulesV20230530CriterionServerLocation();

    @Import(name="continents")
    private @Nullable List<String> continents;

    public Optional<List<String>> continents() {
        return Optional.ofNullable(this.continents);
    }

    @Import(name="countries")
    private @Nullable List<String> countries;

    public Optional<List<String>> countries() {
        return Optional.ofNullable(this.countries);
    }

    @Import(name="locationType")
    private @Nullable String locationType;

    public Optional<String> locationType() {
        return Optional.ofNullable(this.locationType);
    }

    @Import(name="locked")
    private @Nullable Boolean locked;

    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="matchOperator")
    private @Nullable String matchOperator;

    public Optional<String> matchOperator() {
        return Optional.ofNullable(this.matchOperator);
    }

    @Import(name="regions")
    private @Nullable List<String> regions;

    public Optional<List<String>> regions() {
        return Optional.ofNullable(this.regions);
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

    private GetPropertyRulesBuilderRulesV20230530CriterionServerLocation() {}

    private GetPropertyRulesBuilderRulesV20230530CriterionServerLocation(GetPropertyRulesBuilderRulesV20230530CriterionServerLocation $) {
        this.continents = $.continents;
        this.countries = $.countries;
        this.locationType = $.locationType;
        this.locked = $.locked;
        this.matchOperator = $.matchOperator;
        this.regions = $.regions;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230530CriterionServerLocation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230530CriterionServerLocation $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230530CriterionServerLocation();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230530CriterionServerLocation defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230530CriterionServerLocation(Objects.requireNonNull(defaults));
        }

        public Builder continents(@Nullable List<String> continents) {
            $.continents = continents;
            return this;
        }

        public Builder continents(String... continents) {
            return continents(List.of(continents));
        }

        public Builder countries(@Nullable List<String> countries) {
            $.countries = countries;
            return this;
        }

        public Builder countries(String... countries) {
            return countries(List.of(countries));
        }

        public Builder locationType(@Nullable String locationType) {
            $.locationType = locationType;
            return this;
        }

        public Builder locked(@Nullable Boolean locked) {
            $.locked = locked;
            return this;
        }

        public Builder matchOperator(@Nullable String matchOperator) {
            $.matchOperator = matchOperator;
            return this;
        }

        public Builder regions(@Nullable List<String> regions) {
            $.regions = regions;
            return this;
        }

        public Builder regions(String... regions) {
            return regions(List.of(regions));
        }

        public Builder templateUuid(@Nullable String templateUuid) {
            $.templateUuid = templateUuid;
            return this;
        }

        public Builder uuid(@Nullable String uuid) {
            $.uuid = uuid;
            return this;
        }

        public GetPropertyRulesBuilderRulesV20230530CriterionServerLocation build() {
            return $;
        }
    }

}

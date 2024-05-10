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


public final class GetPropertyRulesBuilderRulesV20230530BehaviorSiteShieldSsmapArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20230530BehaviorSiteShieldSsmapArgs Empty = new GetPropertyRulesBuilderRulesV20230530BehaviorSiteShieldSsmapArgs();

    @Import(name="chinaCdnMap")
    private @Nullable Output<String> chinaCdnMap;

    public Optional<Output<String>> chinaCdnMap() {
        return Optional.ofNullable(this.chinaCdnMap);
    }

    @Import(name="hasMixedHosts")
    private @Nullable Output<Boolean> hasMixedHosts;

    public Optional<Output<Boolean>> hasMixedHosts() {
        return Optional.ofNullable(this.hasMixedHosts);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="src")
    private @Nullable Output<String> src;

    public Optional<Output<String>> src() {
        return Optional.ofNullable(this.src);
    }

    @Import(name="srmap")
    private @Nullable Output<String> srmap;

    public Optional<Output<String>> srmap() {
        return Optional.ofNullable(this.srmap);
    }

    @Import(name="value")
    private @Nullable Output<String> value;

    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private GetPropertyRulesBuilderRulesV20230530BehaviorSiteShieldSsmapArgs() {}

    private GetPropertyRulesBuilderRulesV20230530BehaviorSiteShieldSsmapArgs(GetPropertyRulesBuilderRulesV20230530BehaviorSiteShieldSsmapArgs $) {
        this.chinaCdnMap = $.chinaCdnMap;
        this.hasMixedHosts = $.hasMixedHosts;
        this.name = $.name;
        this.src = $.src;
        this.srmap = $.srmap;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorSiteShieldSsmapArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230530BehaviorSiteShieldSsmapArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorSiteShieldSsmapArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorSiteShieldSsmapArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorSiteShieldSsmapArgs(Objects.requireNonNull(defaults));
        }

        public Builder chinaCdnMap(@Nullable Output<String> chinaCdnMap) {
            $.chinaCdnMap = chinaCdnMap;
            return this;
        }

        public Builder chinaCdnMap(String chinaCdnMap) {
            return chinaCdnMap(Output.of(chinaCdnMap));
        }

        public Builder hasMixedHosts(@Nullable Output<Boolean> hasMixedHosts) {
            $.hasMixedHosts = hasMixedHosts;
            return this;
        }

        public Builder hasMixedHosts(Boolean hasMixedHosts) {
            return hasMixedHosts(Output.of(hasMixedHosts));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder src(@Nullable Output<String> src) {
            $.src = src;
            return this;
        }

        public Builder src(String src) {
            return src(Output.of(src));
        }

        public Builder srmap(@Nullable Output<String> srmap) {
            $.srmap = srmap;
            return this;
        }

        public Builder srmap(String srmap) {
            return srmap(Output.of(srmap));
        }

        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public GetPropertyRulesBuilderRulesV20230530BehaviorSiteShieldSsmapArgs build() {
            return $;
        }
    }

}

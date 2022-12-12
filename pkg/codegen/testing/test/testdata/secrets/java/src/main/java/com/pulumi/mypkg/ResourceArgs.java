// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mypkg;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.mypkg.inputs.ConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


public final class ResourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourceArgs Empty = new ResourceArgs();

    @Import(name="config", required=true)
    private Output<ConfigArgs> config;

    public Output<ConfigArgs> config() {
        return this.config;
    }

    @Import(name="configArray", required=true)
    private Output<List<ConfigArgs>> configArray;

    public Output<List<ConfigArgs>> configArray() {
        return this.configArray;
    }

    @Import(name="configMap", required=true)
    private Output<Map<String,ConfigArgs>> configMap;

    public Output<Map<String,ConfigArgs>> configMap() {
        return this.configMap;
    }

    @Import(name="foo", required=true)
    private Output<String> foo;

    public Output<String> foo() {
        return this.foo;
    }

    @Import(name="fooArray", required=true)
    private Output<List<String>> fooArray;

    public Output<List<String>> fooArray() {
        return this.fooArray;
    }

    @Import(name="fooMap", required=true)
    private Output<Map<String,String>> fooMap;

    public Output<Map<String,String>> fooMap() {
        return this.fooMap;
    }

    private ResourceArgs() {}

    private ResourceArgs(ResourceArgs $) {
        this.config = $.config;
        this.configArray = $.configArray;
        this.configMap = $.configMap;
        this.foo = $.foo;
        this.fooArray = $.fooArray;
        this.fooMap = $.fooMap;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceArgs $;

        public Builder() {
            $ = new ResourceArgs();
        }

        public Builder(ResourceArgs defaults) {
            $ = new ResourceArgs(Objects.requireNonNull(defaults));
        }

        public Builder config(Output<ConfigArgs> config) {
            $.config = config;
            return this;
        }

        public Builder config(ConfigArgs config) {
            return config(Output.of(config));
        }

        public Builder configArray(Output<List<ConfigArgs>> configArray) {
            $.configArray = configArray;
            return this;
        }

        public Builder configArray(List<ConfigArgs> configArray) {
            return configArray(Output.of(configArray));
        }

        public Builder configArray(ConfigArgs... configArray) {
            return configArray(List.of(configArray));
        }

        public Builder configMap(Output<Map<String,ConfigArgs>> configMap) {
            $.configMap = configMap;
            return this;
        }

        public Builder configMap(Map<String,ConfigArgs> configMap) {
            return configMap(Output.of(configMap));
        }

        public Builder foo(Output<String> foo) {
            $.foo = foo;
            return this;
        }

        public Builder foo(String foo) {
            return foo(Output.of(foo));
        }

        public Builder fooArray(Output<List<String>> fooArray) {
            $.fooArray = fooArray;
            return this;
        }

        public Builder fooArray(List<String> fooArray) {
            return fooArray(Output.of(fooArray));
        }

        public Builder fooArray(String... fooArray) {
            return fooArray(List.of(fooArray));
        }

        public Builder fooMap(Output<Map<String,String>> fooMap) {
            $.fooMap = fooMap;
            return this;
        }

        public Builder fooMap(Map<String,String> fooMap) {
            return fooMap(Output.of(fooMap));
        }

        public ResourceArgs build() {
            $.config = Objects.requireNonNull($.config, "expected parameter 'config' to be non-null");
            $.configArray = Objects.requireNonNull($.configArray, "expected parameter 'configArray' to be non-null");
            $.configMap = Objects.requireNonNull($.configMap, "expected parameter 'configMap' to be non-null");
            $.foo = Objects.requireNonNull($.foo, "expected parameter 'foo' to be non-null");
            $.fooArray = Objects.requireNonNull($.fooArray, "expected parameter 'fooArray' to be non-null");
            $.fooMap = Objects.requireNonNull($.fooMap, "expected parameter 'fooMap' to be non-null");
            return $;
        }
    }

}

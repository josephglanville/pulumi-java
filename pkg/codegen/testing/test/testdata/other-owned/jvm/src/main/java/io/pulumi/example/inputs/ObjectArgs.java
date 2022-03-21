// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.example.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.example.Resource;
import io.pulumi.example.inputs.ConfigMapArgs;
import io.pulumi.example.inputs.SomeOtherObjectArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ObjectArgs extends io.pulumi.resources.ResourceArgs {

    public static final ObjectArgs Empty = new ObjectArgs();

    @Import(name="bar")
      private final @Nullable Output<String> bar;

    public Output<String> getBar() {
        return this.bar == null ? Output.empty() : this.bar;
    }

    @Import(name="configs")
      private final @Nullable Output<List<ConfigMapArgs>> configs;

    public Output<List<ConfigMapArgs>> getConfigs() {
        return this.configs == null ? Output.empty() : this.configs;
    }

    @Import(name="foo")
      private final @Nullable Output<Resource> foo;

    public Output<Resource> getFoo() {
        return this.foo == null ? Output.empty() : this.foo;
    }

    /**
     * List of lists of other objects
     * 
     */
    @Import(name="others")
      private final @Nullable Output<List<List<SomeOtherObjectArgs>>> others;

    public Output<List<List<SomeOtherObjectArgs>>> getOthers() {
        return this.others == null ? Output.empty() : this.others;
    }

    /**
     * Mapping from string to list of some other object
     * 
     */
    @Import(name="stillOthers")
      private final @Nullable Output<Map<String,List<SomeOtherObjectArgs>>> stillOthers;

    public Output<Map<String,List<SomeOtherObjectArgs>>> getStillOthers() {
        return this.stillOthers == null ? Output.empty() : this.stillOthers;
    }

    public ObjectArgs(
        @Nullable Output<String> bar,
        @Nullable Output<List<ConfigMapArgs>> configs,
        @Nullable Output<Resource> foo,
        @Nullable Output<List<List<SomeOtherObjectArgs>>> others,
        @Nullable Output<Map<String,List<SomeOtherObjectArgs>>> stillOthers) {
        this.bar = bar;
        this.configs = configs;
        this.foo = foo;
        this.others = others;
        this.stillOthers = stillOthers;
    }

    private ObjectArgs() {
        this.bar = Output.empty();
        this.configs = Output.empty();
        this.foo = Output.empty();
        this.others = Output.empty();
        this.stillOthers = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> bar;
        private @Nullable Output<List<ConfigMapArgs>> configs;
        private @Nullable Output<Resource> foo;
        private @Nullable Output<List<List<SomeOtherObjectArgs>>> others;
        private @Nullable Output<Map<String,List<SomeOtherObjectArgs>>> stillOthers;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bar = defaults.bar;
    	      this.configs = defaults.configs;
    	      this.foo = defaults.foo;
    	      this.others = defaults.others;
    	      this.stillOthers = defaults.stillOthers;
        }

        public Builder bar(@Nullable Output<String> bar) {
            this.bar = bar;
            return this;
        }
        public Builder bar(@Nullable String bar) {
            this.bar = Output.ofNullable(bar);
            return this;
        }
        public Builder configs(@Nullable Output<List<ConfigMapArgs>> configs) {
            this.configs = configs;
            return this;
        }
        public Builder configs(@Nullable List<ConfigMapArgs> configs) {
            this.configs = Output.ofNullable(configs);
            return this;
        }
        public Builder configs(ConfigMapArgs... configs) {
            return configs(List.of(configs));
        }
        public Builder foo(@Nullable Output<Resource> foo) {
            this.foo = foo;
            return this;
        }
        public Builder foo(@Nullable Resource foo) {
            this.foo = Output.ofNullable(foo);
            return this;
        }
        public Builder others(@Nullable Output<List<List<SomeOtherObjectArgs>>> others) {
            this.others = others;
            return this;
        }
        public Builder others(@Nullable List<List<SomeOtherObjectArgs>> others) {
            this.others = Output.ofNullable(others);
            return this;
        }
        public Builder stillOthers(@Nullable Output<Map<String,List<SomeOtherObjectArgs>>> stillOthers) {
            this.stillOthers = stillOthers;
            return this;
        }
        public Builder stillOthers(@Nullable Map<String,List<SomeOtherObjectArgs>> stillOthers) {
            this.stillOthers = Output.ofNullable(stillOthers);
            return this;
        }        public ObjectArgs build() {
            return new ObjectArgs(bar, configs, foo, others, stillOthers);
        }
    }
}

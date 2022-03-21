// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudformation;

import io.pulumi.awsnative.cloudformation.enums.HookTypeConfigConfigurationAlias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HookTypeConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final HookTypeConfigArgs Empty = new HookTypeConfigArgs();

    /**
     * The configuration data for the extension, in this account and region.
     * 
     */
    @Import(name="configuration")
      private final @Nullable Output<String> configuration;

    public Output<String> getConfiguration() {
        return this.configuration == null ? Output.empty() : this.configuration;
    }

    /**
     * An alias by which to refer to this extension configuration data.
     * 
     */
    @Import(name="configurationAlias")
      private final @Nullable Output<HookTypeConfigConfigurationAlias> configurationAlias;

    public Output<HookTypeConfigConfigurationAlias> getConfigurationAlias() {
        return this.configurationAlias == null ? Output.empty() : this.configurationAlias;
    }

    /**
     * The Amazon Resource Name (ARN) of the type version.
     * 
     */
    @Import(name="typeArn")
      private final @Nullable Output<String> typeArn;

    public Output<String> getTypeArn() {
        return this.typeArn == null ? Output.empty() : this.typeArn;
    }

    /**
     * The name of the type being registered.
     * 
     * We recommend that type names adhere to the following pattern: company_or_organization::service::type.
     * 
     */
    @Import(name="typeName")
      private final @Nullable Output<String> typeName;

    public Output<String> getTypeName() {
        return this.typeName == null ? Output.empty() : this.typeName;
    }

    public HookTypeConfigArgs(
        @Nullable Output<String> configuration,
        @Nullable Output<HookTypeConfigConfigurationAlias> configurationAlias,
        @Nullable Output<String> typeArn,
        @Nullable Output<String> typeName) {
        this.configuration = configuration;
        this.configurationAlias = configurationAlias;
        this.typeArn = typeArn;
        this.typeName = typeName;
    }

    private HookTypeConfigArgs() {
        this.configuration = Output.empty();
        this.configurationAlias = Output.empty();
        this.typeArn = Output.empty();
        this.typeName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HookTypeConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> configuration;
        private @Nullable Output<HookTypeConfigConfigurationAlias> configurationAlias;
        private @Nullable Output<String> typeArn;
        private @Nullable Output<String> typeName;

        public Builder() {
    	      // Empty
        }

        public Builder(HookTypeConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configuration = defaults.configuration;
    	      this.configurationAlias = defaults.configurationAlias;
    	      this.typeArn = defaults.typeArn;
    	      this.typeName = defaults.typeName;
        }

        public Builder configuration(@Nullable Output<String> configuration) {
            this.configuration = configuration;
            return this;
        }
        public Builder configuration(@Nullable String configuration) {
            this.configuration = Output.ofNullable(configuration);
            return this;
        }
        public Builder configurationAlias(@Nullable Output<HookTypeConfigConfigurationAlias> configurationAlias) {
            this.configurationAlias = configurationAlias;
            return this;
        }
        public Builder configurationAlias(@Nullable HookTypeConfigConfigurationAlias configurationAlias) {
            this.configurationAlias = Output.ofNullable(configurationAlias);
            return this;
        }
        public Builder typeArn(@Nullable Output<String> typeArn) {
            this.typeArn = typeArn;
            return this;
        }
        public Builder typeArn(@Nullable String typeArn) {
            this.typeArn = Output.ofNullable(typeArn);
            return this;
        }
        public Builder typeName(@Nullable Output<String> typeName) {
            this.typeName = typeName;
            return this;
        }
        public Builder typeName(@Nullable String typeName) {
            this.typeName = Output.ofNullable(typeName);
            return this;
        }        public HookTypeConfigArgs build() {
            return new HookTypeConfigArgs(configuration, configurationAlias, typeArn, typeName);
        }
    }
}

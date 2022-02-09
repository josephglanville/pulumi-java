// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dbformariadb;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.dbformariadb.ConfigurationArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:dbformariadb:Configuration")
public class Configuration extends io.pulumi.resources.CustomResource {
    @OutputExport(name="allowedValues", type=String.class, parameters={})
    private Output<String> allowedValues;

    public Output<String> getAllowedValues() {
        return this.allowedValues;
    }
    @OutputExport(name="dataType", type=String.class, parameters={})
    private Output<String> dataType;

    public Output<String> getDataType() {
        return this.dataType;
    }
    @OutputExport(name="defaultValue", type=String.class, parameters={})
    private Output<String> defaultValue;

    public Output<String> getDefaultValue() {
        return this.defaultValue;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    public Output<String> getDescription() {
        return this.description;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="source", type=String.class, parameters={})
    private Output</* @Nullable */ String> source;

    public Output</* @Nullable */ String> getSource() {
        return this.source;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }
    @OutputExport(name="value", type=String.class, parameters={})
    private Output</* @Nullable */ String> value;

    public Output</* @Nullable */ String> getValue() {
        return this.value;
    }

    public Configuration(String name, ConfigurationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:dbformariadb:Configuration", name, args == null ? ConfigurationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Configuration(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:dbformariadb:Configuration", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:dbformariadb/v20180601:Configuration").build()),
                Input.of(Alias.builder().setType("azure-native:dbformariadb/v20180601preview:Configuration").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Configuration get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Configuration(name, id, options);
    }
}

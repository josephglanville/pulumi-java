// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mypkg;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.mypkg.ResourceArgs;
import com.pulumi.mypkg.Utilities;
import com.pulumi.mypkg.outputs.Config;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="mypkg::Resource")
public class Resource extends com.pulumi.resources.CustomResource {
    @Export(name="config", refs={Config.class}, tree="[0]")
    private Output<Config> config;

    public Output<Config> config() {
        return this.config;
    }
    @Export(name="configArray", refs={List.class,Config.class}, tree="[0,1]")
    private Output<List<Config>> configArray;

    public Output<List<Config>> configArray() {
        return this.configArray;
    }
    @Export(name="configMap", refs={Map.class,String.class,Config.class}, tree="[0,1,2]")
    private Output<Map<String,Config>> configMap;

    public Output<Map<String,Config>> configMap() {
        return this.configMap;
    }
    @Export(name="foo", refs={String.class}, tree="[0]")
    private Output<String> foo;

    public Output<String> foo() {
        return this.foo;
    }
    @Export(name="fooArray", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> fooArray;

    public Output<List<String>> fooArray() {
        return this.fooArray;
    }
    @Export(name="fooMap", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> fooMap;

    public Output<Map<String,String>> fooMap() {
        return this.fooMap;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Resource(String name) {
        this(name, ResourceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Resource(String name, ResourceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Resource(String name, ResourceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mypkg::Resource", name, args == null ? ResourceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Resource(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mypkg::Resource", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "config",
                "configArray",
                "configMap",
                "foo",
                "fooArray",
                "fooMap"
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Resource get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Resource(name, id, options);
    }
}

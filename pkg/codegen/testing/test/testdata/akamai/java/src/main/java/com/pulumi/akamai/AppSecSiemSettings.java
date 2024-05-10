// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.akamai.AppSecSiemSettingsArgs;
import com.pulumi.akamai.Utilities;
import com.pulumi.akamai.inputs.AppSecSiemSettingsState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="akamai:index/appSecSiemSettings:AppSecSiemSettings")
public class AppSecSiemSettings extends com.pulumi.resources.CustomResource {
    /**
     * Unique identifier of the security configuration
     * 
     */
    @Export(name="configId", refs={Integer.class}, tree="[0]")
    private Output<Integer> configId;

    /**
     * @return Unique identifier of the security configuration
     * 
     */
    public Output<Integer> configId() {
        return this.configId;
    }
    /**
     * Whether Bot Manager events should be included in SIEM events
     * 
     */
    @Export(name="enableBotmanSiem", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> enableBotmanSiem;

    /**
     * @return Whether Bot Manager events should be included in SIEM events
     * 
     */
    public Output<Boolean> enableBotmanSiem() {
        return this.enableBotmanSiem;
    }
    /**
     * Whether to enable SIEM on all security policies in the security configuration
     * 
     */
    @Export(name="enableForAllPolicies", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> enableForAllPolicies;

    /**
     * @return Whether to enable SIEM on all security policies in the security configuration
     * 
     */
    public Output<Boolean> enableForAllPolicies() {
        return this.enableForAllPolicies;
    }
    /**
     * Whether to enable SIEM
     * 
     */
    @Export(name="enableSiem", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> enableSiem;

    /**
     * @return Whether to enable SIEM
     * 
     */
    public Output<Boolean> enableSiem() {
        return this.enableSiem;
    }
    /**
     * List of IDs of security policy for which SIEM integration is to be enabled
     * 
     */
    @Export(name="securityPolicyIds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> securityPolicyIds;

    /**
     * @return List of IDs of security policy for which SIEM integration is to be enabled
     * 
     */
    public Output<Optional<List<String>>> securityPolicyIds() {
        return Codegen.optional(this.securityPolicyIds);
    }
    /**
     * Unique identifier of the SIEM settings being modified
     * 
     */
    @Export(name="siemId", refs={Integer.class}, tree="[0]")
    private Output<Integer> siemId;

    /**
     * @return Unique identifier of the SIEM settings being modified
     * 
     */
    public Output<Integer> siemId() {
        return this.siemId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AppSecSiemSettings(String name) {
        this(name, AppSecSiemSettingsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AppSecSiemSettings(String name, AppSecSiemSettingsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AppSecSiemSettings(String name, AppSecSiemSettingsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/appSecSiemSettings:AppSecSiemSettings", name, args == null ? AppSecSiemSettingsArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AppSecSiemSettings(String name, Output<String> id, @Nullable AppSecSiemSettingsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/appSecSiemSettings:AppSecSiemSettings", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static AppSecSiemSettings get(String name, Output<String> id, @Nullable AppSecSiemSettingsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AppSecSiemSettings(name, id, state, options);
    }
}

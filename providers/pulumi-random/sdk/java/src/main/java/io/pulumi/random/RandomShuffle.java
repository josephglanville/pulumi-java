// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.random;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.random.RandomShuffleArgs;
import io.pulumi.random.Utilities;
import io.pulumi.random.inputs.RandomShuffleState;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * The resource `random.RandomShuffle` generates a random permutation of a list of strings given as an argument.
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="random:index/randomShuffle:RandomShuffle")
public class RandomShuffle extends io.pulumi.resources.CustomResource {
    /**
     * The list of strings to shuffle.
     * 
     */
    @OutputExport(name="inputs", type=List.class, parameters={String.class})
    private Output<List<String>> inputs;

    /**
     * @return The list of strings to shuffle.
     * 
     */
    public Output<List<String>> getInputs() {
        return this.inputs;
    }
    /**
     * Arbitrary map of values that, when changed, will trigger recreation of resource. See the main provider documentation for more information.
     * 
     */
    @OutputExport(name="keepers", type=Map.class, parameters={String.class, Object.class})
    private Output</* @Nullable */ Map<String,Object>> keepers;

    /**
     * @return Arbitrary map of values that, when changed, will trigger recreation of resource. See the main provider documentation for more information.
     * 
     */
    public Output</* @Nullable */ Map<String,Object>> getKeepers() {
        return this.keepers;
    }
    /**
     * The number of results to return. Defaults to the number of items in the `input` list. If fewer items are requested, some elements will be excluded from the result. If more items are requested, items will be repeated in the result but not more frequently than the number of items in the input list.
     * 
     */
    @OutputExport(name="resultCount", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> resultCount;

    /**
     * @return The number of results to return. Defaults to the number of items in the `input` list. If fewer items are requested, some elements will be excluded from the result. If more items are requested, items will be repeated in the result but not more frequently than the number of items in the input list.
     * 
     */
    public Output</* @Nullable */ Integer> getResultCount() {
        return this.resultCount;
    }
    /**
     * Random permutation of the list of strings given in `input`.
     * 
     */
    @OutputExport(name="results", type=List.class, parameters={String.class})
    private Output<List<String>> results;

    /**
     * @return Random permutation of the list of strings given in `input`.
     * 
     */
    public Output<List<String>> getResults() {
        return this.results;
    }
    /**
     * Arbitrary string with which to seed the random number generator, in order to produce less-volatile permutations of the list.
     * 
     */
    @OutputExport(name="seed", type=String.class, parameters={})
    private Output</* @Nullable */ String> seed;

    /**
     * @return Arbitrary string with which to seed the random number generator, in order to produce less-volatile permutations of the list.
     * 
     */
    public Output</* @Nullable */ String> getSeed() {
        return this.seed;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RandomShuffle(String name, RandomShuffleArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("random:index/randomShuffle:RandomShuffle", name, args == null ? RandomShuffleArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private RandomShuffle(String name, Input<String> id, @Nullable RandomShuffleState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("random:index/randomShuffle:RandomShuffle", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
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
    public static RandomShuffle get(String name, Input<String> id, @Nullable RandomShuffleState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RandomShuffle(name, id, state, options);
    }
}

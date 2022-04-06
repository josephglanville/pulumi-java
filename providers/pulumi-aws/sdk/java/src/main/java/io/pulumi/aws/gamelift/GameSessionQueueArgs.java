// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.gamelift;

import io.pulumi.aws.gamelift.inputs.GameSessionQueuePlayerLatencyPolicyArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GameSessionQueueArgs extends io.pulumi.resources.ResourceArgs {

    public static final GameSessionQueueArgs Empty = new GameSessionQueueArgs();

    /**
     * List of fleet/alias ARNs used by session queue for placing game sessions.
     * 
     */
    @Import(name="destinations")
      private final @Nullable Output<List<String>> destinations;

    public Output<List<String>> getDestinations() {
        return this.destinations == null ? Output.empty() : this.destinations;
    }

    /**
     * Name of the session queue.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * One or more policies used to choose fleet based on player latency. See below.
     * 
     */
    @Import(name="playerLatencyPolicies")
      private final @Nullable Output<List<GameSessionQueuePlayerLatencyPolicyArgs>> playerLatencyPolicies;

    public Output<List<GameSessionQueuePlayerLatencyPolicyArgs>> getPlayerLatencyPolicies() {
        return this.playerLatencyPolicies == null ? Output.empty() : this.playerLatencyPolicies;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * Maximum time a game session request can remain in the queue.
     * 
     */
    @Import(name="timeoutInSeconds")
      private final @Nullable Output<Integer> timeoutInSeconds;

    public Output<Integer> getTimeoutInSeconds() {
        return this.timeoutInSeconds == null ? Output.empty() : this.timeoutInSeconds;
    }

    public GameSessionQueueArgs(
        @Nullable Output<List<String>> destinations,
        @Nullable Output<String> name,
        @Nullable Output<List<GameSessionQueuePlayerLatencyPolicyArgs>> playerLatencyPolicies,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Integer> timeoutInSeconds) {
        this.destinations = destinations;
        this.name = name;
        this.playerLatencyPolicies = playerLatencyPolicies;
        this.tags = tags;
        this.timeoutInSeconds = timeoutInSeconds;
    }

    private GameSessionQueueArgs() {
        this.destinations = Output.empty();
        this.name = Output.empty();
        this.playerLatencyPolicies = Output.empty();
        this.tags = Output.empty();
        this.timeoutInSeconds = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GameSessionQueueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> destinations;
        private @Nullable Output<String> name;
        private @Nullable Output<List<GameSessionQueuePlayerLatencyPolicyArgs>> playerLatencyPolicies;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Integer> timeoutInSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(GameSessionQueueArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinations = defaults.destinations;
    	      this.name = defaults.name;
    	      this.playerLatencyPolicies = defaults.playerLatencyPolicies;
    	      this.tags = defaults.tags;
    	      this.timeoutInSeconds = defaults.timeoutInSeconds;
        }

        public Builder destinations(@Nullable Output<List<String>> destinations) {
            this.destinations = destinations;
            return this;
        }
        public Builder destinations(@Nullable List<String> destinations) {
            this.destinations = Output.ofNullable(destinations);
            return this;
        }
        public Builder destinations(String... destinations) {
            return destinations(List.of(destinations));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder playerLatencyPolicies(@Nullable Output<List<GameSessionQueuePlayerLatencyPolicyArgs>> playerLatencyPolicies) {
            this.playerLatencyPolicies = playerLatencyPolicies;
            return this;
        }
        public Builder playerLatencyPolicies(@Nullable List<GameSessionQueuePlayerLatencyPolicyArgs> playerLatencyPolicies) {
            this.playerLatencyPolicies = Output.ofNullable(playerLatencyPolicies);
            return this;
        }
        public Builder playerLatencyPolicies(GameSessionQueuePlayerLatencyPolicyArgs... playerLatencyPolicies) {
            return playerLatencyPolicies(List.of(playerLatencyPolicies));
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder timeoutInSeconds(@Nullable Output<Integer> timeoutInSeconds) {
            this.timeoutInSeconds = timeoutInSeconds;
            return this;
        }
        public Builder timeoutInSeconds(@Nullable Integer timeoutInSeconds) {
            this.timeoutInSeconds = Output.ofNullable(timeoutInSeconds);
            return this;
        }        public GameSessionQueueArgs build() {
            return new GameSessionQueueArgs(destinations, name, playerLatencyPolicies, tags, timeoutInSeconds);
        }
    }
}
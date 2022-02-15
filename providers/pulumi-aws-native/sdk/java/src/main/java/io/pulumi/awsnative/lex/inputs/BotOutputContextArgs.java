// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class BotOutputContextArgs extends io.pulumi.resources.ResourceArgs {

    public static final BotOutputContextArgs Empty = new BotOutputContextArgs();

    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    @InputImport(name="timeToLiveInSeconds", required=true)
    private final Input<Integer> timeToLiveInSeconds;

    public Input<Integer> getTimeToLiveInSeconds() {
        return this.timeToLiveInSeconds;
    }

    @InputImport(name="turnsToLive", required=true)
    private final Input<Integer> turnsToLive;

    public Input<Integer> getTurnsToLive() {
        return this.turnsToLive;
    }

    public BotOutputContextArgs(
        Input<String> name,
        Input<Integer> timeToLiveInSeconds,
        Input<Integer> turnsToLive) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.timeToLiveInSeconds = Objects.requireNonNull(timeToLiveInSeconds, "expected parameter 'timeToLiveInSeconds' to be non-null");
        this.turnsToLive = Objects.requireNonNull(turnsToLive, "expected parameter 'turnsToLive' to be non-null");
    }

    private BotOutputContextArgs() {
        this.name = Input.empty();
        this.timeToLiveInSeconds = Input.empty();
        this.turnsToLive = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotOutputContextArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> name;
        private Input<Integer> timeToLiveInSeconds;
        private Input<Integer> turnsToLive;

        public Builder() {
    	      // Empty
        }

        public Builder(BotOutputContextArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.timeToLiveInSeconds = defaults.timeToLiveInSeconds;
    	      this.turnsToLive = defaults.turnsToLive;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setTimeToLiveInSeconds(Input<Integer> timeToLiveInSeconds) {
            this.timeToLiveInSeconds = Objects.requireNonNull(timeToLiveInSeconds);
            return this;
        }

        public Builder setTimeToLiveInSeconds(Integer timeToLiveInSeconds) {
            this.timeToLiveInSeconds = Input.of(Objects.requireNonNull(timeToLiveInSeconds));
            return this;
        }

        public Builder setTurnsToLive(Input<Integer> turnsToLive) {
            this.turnsToLive = Objects.requireNonNull(turnsToLive);
            return this;
        }

        public Builder setTurnsToLive(Integer turnsToLive) {
            this.turnsToLive = Input.of(Objects.requireNonNull(turnsToLive));
            return this;
        }

        public BotOutputContextArgs build() {
            return new BotOutputContextArgs(name, timeToLiveInSeconds, turnsToLive);
        }
    }
}
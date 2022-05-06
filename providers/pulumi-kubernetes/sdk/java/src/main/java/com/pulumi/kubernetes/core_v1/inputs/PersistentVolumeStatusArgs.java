// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * PersistentVolumeStatus is the current status of a persistent volume.
 * 
 */
public final class PersistentVolumeStatusArgs extends com.pulumi.resources.ResourceArgs {

    public static final PersistentVolumeStatusArgs Empty = new PersistentVolumeStatusArgs();

    /**
     * message is a human-readable message indicating details about why the volume is in this state.
     * 
     */
    @Import(name="message")
    private @Nullable Output<String> message;

    /**
     * @return message is a human-readable message indicating details about why the volume is in this state.
     * 
     */
    public Optional<Output<String>> message() {
        return Optional.ofNullable(this.message);
    }

    /**
     * phase indicates if a volume is available, bound to a claim, or released by a claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#phase
     * 
     */
    @Import(name="phase")
    private @Nullable Output<String> phase;

    /**
     * @return phase indicates if a volume is available, bound to a claim, or released by a claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#phase
     * 
     */
    public Optional<Output<String>> phase() {
        return Optional.ofNullable(this.phase);
    }

    /**
     * reason is a brief CamelCase string that describes any failure and is meant for machine parsing and tidy display in the CLI.
     * 
     */
    @Import(name="reason")
    private @Nullable Output<String> reason;

    /**
     * @return reason is a brief CamelCase string that describes any failure and is meant for machine parsing and tidy display in the CLI.
     * 
     */
    public Optional<Output<String>> reason() {
        return Optional.ofNullable(this.reason);
    }

    private PersistentVolumeStatusArgs() {}

    private PersistentVolumeStatusArgs(PersistentVolumeStatusArgs $) {
        this.message = $.message;
        this.phase = $.phase;
        this.reason = $.reason;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PersistentVolumeStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PersistentVolumeStatusArgs $;

        public Builder() {
            $ = new PersistentVolumeStatusArgs();
        }

        public Builder(PersistentVolumeStatusArgs defaults) {
            $ = new PersistentVolumeStatusArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param message message is a human-readable message indicating details about why the volume is in this state.
         * 
         * @return builder
         * 
         */
        public Builder message(@Nullable Output<String> message) {
            $.message = message;
            return this;
        }

        /**
         * @param message message is a human-readable message indicating details about why the volume is in this state.
         * 
         * @return builder
         * 
         */
        public Builder message(String message) {
            return message(Output.of(message));
        }

        /**
         * @param phase phase indicates if a volume is available, bound to a claim, or released by a claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#phase
         * 
         * @return builder
         * 
         */
        public Builder phase(@Nullable Output<String> phase) {
            $.phase = phase;
            return this;
        }

        /**
         * @param phase phase indicates if a volume is available, bound to a claim, or released by a claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#phase
         * 
         * @return builder
         * 
         */
        public Builder phase(String phase) {
            return phase(Output.of(phase));
        }

        /**
         * @param reason reason is a brief CamelCase string that describes any failure and is meant for machine parsing and tidy display in the CLI.
         * 
         * @return builder
         * 
         */
        public Builder reason(@Nullable Output<String> reason) {
            $.reason = reason;
            return this;
        }

        /**
         * @param reason reason is a brief CamelCase string that describes any failure and is meant for machine parsing and tidy display in the CLI.
         * 
         * @return builder
         * 
         */
        public Builder reason(String reason) {
            return reason(Output.of(reason));
        }

        public PersistentVolumeStatusArgs build() {
            return $;
        }
    }

}
